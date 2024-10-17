package cda.java.exercice7;

import io.cucumber.java.en.*;

public class RemoveProductOrder {

    @Given("l'utilisateur a ajouté un produit dans la commande")
    public void user_has_added_product_to_order() {
        System.out.println("Le produit a été ajouté à la commande.");
    }

    @When("l'utilisateur clique sur le bouton {string} à côté du produit")
    public void user_clicks_on_remove_button_next_to_product(String buttonLabel) {
        if (buttonLabel.equals("Supprimer")) {
            System.out.println("L'utilisateur a cliqué sur le bouton 'Supprimer' à côté du produit.");
        } else {
            System.out.println("Bouton non reconnu.");
        }
    }

    @Then("la quantité du produit est diminuée de 1")
    public void product_quantity_is_decreased_by_1() {
        System.out.println("La quantité du produit a été diminuée de 1.");
    }

    @Given("l'utilisateur a ajouté un produit dans la commande avec une seule unité")
    public void user_has_added_single_unit_product_to_order() {
        System.out.println("Le produit avec une seule unité a été ajouté à la commande.");
    }

    @Then("le produit est retiré de la commande")
    public void product_is_removed_from_order() {
        System.out.println("Le produit a été retiré de la commande.");
    }

    @Given("l'utilisateur n'a pas ajouté ce produit dans la commande")
    public void user_has_not_added_product_to_order() {
        System.out.println("Le produit n'a pas été ajouté à la commande.");
    }

    @Then("une erreur est renvoyée indiquant que le produit ne se trouve pas dans la commande")
    public void error_product_not_in_order_is_returned() {
        System.out.println("Erreur : Le produit ne se trouve pas dans la commande.");
    }
}
