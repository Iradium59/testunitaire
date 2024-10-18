package cda.java.exercice7;

import io.cucumber.java.en.*;

public class ValidOrder {

    @Given("l'utilisateur accède au formulaire de commande")
    public void user_accesses_order_form() {
        System.out.println("L'utilisateur accède au formulaire de commande.");
    }

    @When("l'utilisateur valide la commande")
    public void user_validates_order() {
        System.out.println("L'utilisateur valide la commande.");
    }

    @Then("l'utilisateur reçoit une confirmation de commande")
    public void user_receives_order_confirmation() {
        System.out.println("Confirmation : La commande a été validée.");
    }

    @Then("l'utilisateur voit les détails de sa commande")
    public void user_sees_order_details() {
        System.out.println("Détails de la commande affichés.");
    }

    @When("l'utilisateur tente de valider une commande qui n'existe pas")
    public void user_tries_to_validate_nonexistent_order() {
        System.out.println("Tentative de valider une commande inexistante.");
    }

    @Then("une erreur est renvoyée indiquant que la commande n'existe pas")
    public void error_order_does_not_exist_is_returned() {
        System.out.println("Erreur : La commande n'existe pas.");
    }

    @Then("l'utilisateur est invité à revenir à la page d'accueil")
    public void user_is_redirected_to_homepage() {
        System.out.println("L'utilisateur est invité à revenir à la page d'accueil.");
    }
}
