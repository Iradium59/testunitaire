package cda.java.exercice7;

import io.cucumber.java.en.*;

public class CreateAccountStep {

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

    @Then("l'utilisateur reçoit une confirmation")
    public void user_receives_confirmation() {
        System.out.println("Confirmation envoyée.");
    }

    @When("l'utilisateur entre un email qui existe déjà dans la base de données")
    public void user_enters_existing_email_in_database() {
        System.out.println("Email déjà utilisé.");
    }

    @Then("une erreur indiquant que l'email est déjà utilisé est renvoyée")
    public void error_email_already_in_use_is_returned() {
        System.out.println("Erreur : Email déjà utilisé.");
    }
}
