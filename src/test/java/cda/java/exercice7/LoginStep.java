package cda.java.exercice7;

import io.cucumber.java.en.*;

public class LoginStep {

    @Given("l'utilisateur accède au formulaire de connexion")
    public void user_accesses_login_form() {
        System.out.println("Formulaire de connexion affiché.");
    }

    @When("l'utilisateur entre un nom d'utilisateur et un mot de passe valides")
    public void user_enters_valid_username_and_password() {
        System.out.println("Nom d'utilisateur et mot de passe valides entrés.");
    }

    @When("l'utilisateur entre un nom d'utilisateur ou un mot de passe incorrect")
    public void user_enters_invalid_username_or_password() {
        System.out.println("Nom d'utilisateur ou mot de passe incorrect.");
    }

    @Then("l'utilisateur est redirigé vers la page d'accueil")
    public void user_is_redirected_to_home_page() {
        System.out.println("Utilisateur redirigé vers la page d'accueil.");
    }

    @Then("l'utilisateur voit son tableau de bord")
    public void user_sees_dashboard() {
        System.out.println("Tableau de bord affiché.");
    }

    @Then("l'utilisateur voit un message d'erreur indiquant que les informations sont incorrectes")
    public void user_sees_error_message_for_incorrect_information() {
        System.out.println("Erreur : Nom d'utilisateur ou mot de passe incorrect.");
    }

    @Then("l'utilisateur est invité à réessayer")
    public void user_is_invited_to_try_again() {
        System.out.println("L'utilisateur est invité à réessayer.");
    }
}
