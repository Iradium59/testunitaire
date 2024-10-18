package cda.java.exercice7;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps {

    private Login login;
    private String lastErrorMessage;
    private boolean loginSuccessful;

    public LoginSteps() {
        login = new Login();
        lastErrorMessage = null;
        loginSuccessful = false;
    }

    @Given("l'utilisateur accède au formulaire de connexion")
    public void user_accesses_login_form() {
        System.out.println("Formulaire de connexion affiché.");
    }

    @When("l'utilisateur entre un nom d'utilisateur {string} et un mot de passe {string}")
    public void user_enters_username_and_password(String username, String password) {
        try {
            loginSuccessful = login.authenticate(username, password);
        } catch (Exception e) {
            lastErrorMessage = e.getMessage();
        }
    }

    @Then("l'utilisateur est redirigé vers la page d'accueil")
    public void user_is_redirected_to_home_page() {
        Assert.assertTrue("L'utilisateur aurait dû être redirigé vers la page d'accueil.", loginSuccessful);
    }

    @Then("l'utilisateur voit son tableau de bord")
    public void user_sees_dashboard() {
        Assert.assertTrue("L'utilisateur aurait dû voir son tableau de bord.", loginSuccessful);
        System.out.println("Tableau de bord affiché.");
    }

    @When("l'utilisateur entre un nom d'utilisateur {string} ou un mot de passe {string} incorrect")
    public void user_enters_invalid_username_or_password(String username, String password) {
        try {
            loginSuccessful = login.authenticate(username, password);
        } catch (Exception e) {
            lastErrorMessage = e.getMessage();
        }
    }

    @Then("l'utilisateur voit un message d'erreur indiquant que les informations sont incorrectes")
    public void user_sees_error_message_for_incorrect_information() {
        Assert.assertEquals("Nom d'utilisateur ou mot de passe incorrect.", lastErrorMessage);
    }

    @Then("l'utilisateur est invité à réessayer")
    public void user_is_invited_to_try_again() {
        Assert.assertNotNull("L'utilisateur devrait voir une erreur.", lastErrorMessage);
        System.out.println("L'utilisateur est invité à réessayer.");
    }
}
