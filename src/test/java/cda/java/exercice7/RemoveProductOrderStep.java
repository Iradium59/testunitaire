package cda.java.exercice7;

import io.cucumber.java.en.*;

public class RemoveProductOrderStep {

    @Given("l'utilisateur a ajouté un produit dans la commande")
    public void user_has_added_product_to_order() {
        System.out.println("Le produit a été ajouté à la commande.");
    }

    @When("l'utilisateur clique sur le bouton {string} à côté du produit")
    public void user_clicks_on_remove_button_next_to_product(String buttonLabel) {
        if (buttonLabel.equals("Supprimer")) {
            System.out.println("L'utilisateur a cliqué sur le bouton 'Supprimer'.");
        }
    }

    @Then("la quantité du produit est diminuée de 1")
    public void product_quantity_is_decreased_by_1() {
        System.out.println("Quantité diminuée de 1.");
    }

    @Then("le total de la commande est mis à jour")
    public void order_total_is_updated() {
        System.out.println("Le total de la commande a été mis à jour.");
    }

    @Given("l'utilisateur a ajouté un produit dans la commande avec une seule unité")
    public void user_has_added_single_unit_product_to_order() {
        System.out.println("Le produit avec une seule unité a été ajouté.");
    }

    @Then("le produit est retiré de la commande")
    public void product_is_removed_from_order() {
        System.out.println("Produit retiré de la commande.");
    }

    @Then("l'utilisateur voit un message de confirmation de suppression")
    public void user_sees_confirmation_of_removal() {
        System.out.println("Message de confirmation de suppression affiché.");
    }
}
