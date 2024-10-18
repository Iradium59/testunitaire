package cda.java.exercice7;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class CreateAccountSteps {

    private CreateAccount createAccount;
    private String lastErrorMessage;
    private boolean accountCreated;

    public CreateAccountSteps() {
        createAccount = new CreateAccount();
        lastErrorMessage = null;
        accountCreated = false;
    }

    @Given("l'utilisateur accède au formulaire d'inscription")
    public void user_accesses_registration_form() {
        System.out.println("Formulaire d'inscription affiché.");
    }

    @When("l'utilisateur entre un email {string}, un nom d'utilisateur {string}, et un mot de passe {string}")
    public void user_enters_email_username_and_password(String email, String username, String password) {
        try {
            accountCreated = createAccount.createAccount(email, username, password);
        } catch (Exception e) {
            lastErrorMessage = e.getMessage();
        }
    }

    @Then("le compte de l'utilisateur est créé")
    public void user_account_is_created() {
        Assert.assertTrue("Le compte aurait dû être créé.", accountCreated);
    }

    @Then("l'utilisateur reçoit une confirmation")
    public void user_receives_confirmation() {
        Assert.assertTrue("L'utilisateur n'a pas reçu de confirmation car le compte n'a pas été créé.", accountCreated);
    }

    @When("l'utilisateur entre un email qui existe déjà dans la base de données {string}")
    public void user_enters_existing_email_in_database(String email) {
        try {
            accountCreated = createAccount.createAccount(email, "someusername", "somepassword");
        } catch (Exception e) {
            lastErrorMessage = e.getMessage();
        }
    }

    @Then("une erreur indiquant que l'email est déjà utilisé est renvoyée")
    public void error_email_already_in_use_is_returned() {
        Assert.assertEquals("Cet email est déjà utilisé.", lastErrorMessage);
    }

    @Then("l'utilisateur est invité à entrer un autre email")
    public void user_is_prompted_to_enter_another_email() {
        Assert.assertEquals("Cet email est déjà utilisé.", lastErrorMessage);
        System.out.println("L'utilisateur est invité à entrer un autre email.");
    }
}
