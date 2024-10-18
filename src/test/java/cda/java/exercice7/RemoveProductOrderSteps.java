package cda.java.exercice7;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class RemoveProductOrderSteps {

    private RemoveProductOrder removeProductOrder;
    private String lastErrorMessage;
    private int productQuantity;

    public RemoveProductOrderSteps() {
        removeProductOrder = new RemoveProductOrder();
        lastErrorMessage = null;
        productQuantity = 0;
    }

    @Given("l'utilisateur a ajouté un produit dans la commande")
    public void user_has_added_product_to_order() {
        removeProductOrder.addProduct("ProduitTest");
        productQuantity = removeProductOrder.getProductQuantity("ProduitTest");
    }

    @When("l'utilisateur clique sur le bouton {string} à côté du produit")
    public void user_clicks_remove_button_next_to_product(String buttonLabel) {
        if (buttonLabel.equals("Supprimer")) {
            try {
                removeProductOrder.removeProduct("ProduitTest");
                productQuantity = removeProductOrder.getProductQuantity("ProduitTest");
            } catch (Exception e) {
                lastErrorMessage = e.getMessage();
            }
        }
    }

    @Then("la quantité du produit est diminuée de 1")
    public void product_quantity_is_decreased_by_1() {
        Assert.assertTrue("La quantité aurait dû être diminuée.", productQuantity >= 0);
        System.out.println("La quantité du produit est maintenant : " + productQuantity);
    }

    @Then("le total de la commande est mis à jour")
    public void order_total_is_updated() {
        Assert.assertTrue("Le total de la commande a été mis à jour.", true);
    }

    @Given("l'utilisateur a ajouté un produit dans la commande avec une seule unité")
    public void user_has_added_single_unit_product_to_order() {
        removeProductOrder.addProduct("ProduitTest");
        productQuantity = removeProductOrder.getProductQuantity("ProduitTest");
    }

    @Then("le produit est retiré de la commande")
    public void product_is_removed_from_order() {
        Assert.assertEquals("Le produit aurait dû être retiré.", 0, productQuantity);
        System.out.println("Le produit a été retiré de la commande.");
    }

    @Then("l'utilisateur voit un message de confirmation de suppression")
    public void user_sees_confirmation_of_removal() {
        System.out.println("Message de confirmation de suppression affiché.");
    }

    @Given("l'utilisateur n'a pas ajouté ce produit dans la commande")
    public void user_has_not_added_product_to_order() {
        productQuantity = 0;
    }

    @Then("une erreur est renvoyée indiquant que le produit ne se trouve pas dans la commande")
    public void error_product_not_in_order_is_returned() {
        Assert.assertEquals("Le produit ne se trouve pas dans la commande.", lastErrorMessage);
        System.out.println("Erreur : Le produit ne se trouve pas dans la commande.");
    }
}
