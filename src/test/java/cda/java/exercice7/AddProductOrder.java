package cda.java.exercice7;

import io.cucumber.java.en.*;

public class AddProductOrder {

    @Given("l'utilisateur est sur la page produit")
    public void user_is_on_product_page() {
        System.out.println("L'utilisateur est sur la page produit.");
    }

    @When("l'utilisateur clique sur le bouton {string}")
    public void user_clicks_on_button(String buttonLabel) {
        System.out.println("L'utilisateur a cliqué sur le bouton : " + buttonLabel);
    }

    @Then("l'utilisateur voit une confirmation que le produit a été ajouté à la commande")
    public void user_sees_confirmation_product_added_to_order() {
        System.out.println("Confirmation : Le produit a été ajouté à la commande.");
    }

    @Given("l'utilisateur a déjà ajouté un produit dans la commande")
    public void user_has_already_added_product_to_order() {
        System.out.println("Le produit est déjà dans la commande.");
    }

    @When("l'utilisateur clique à nouveau sur le bouton {string}")
    public void user_clicks_on_button_2(String buttonLabel) {
        System.out.println("L'utilisateur a cliqué sur le bouton : " + buttonLabel);
    }

    @Then("la quantité du produit dans la commande est augmentée de 1")
    public void product_quantity_in_order_is_increased_by_1() {
        System.out.println("La quantité du produit dans la commande est augmentée de 1.");
    }
}
