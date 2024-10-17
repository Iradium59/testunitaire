package cda.java.exercice7;

import io.cucumber.java.en.*;

public class CreateAccount {

    @Given("l'utilisateur accède au formulaire d'inscription")
    public void user_accesses_registration_form() {
        System.out.println("Formulaire d'inscription affiché.");
    }

    @When("l'utilisateur entre un email, un nom d'utilisateur, et un mot de passe")
    public void user_enters_email_username_and_password() {
        System.out.println("Utilisateur entre les informations.");
    }

    @Then("le compte de l'utilisateur est créé")
    public void user_account_is_created() {
        System.out.println("Compte utilisateur créé.");
    }
}
