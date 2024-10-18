package cda.java.exercice7;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class AddProductOrderSteps {

    private AddProductOrder addProductOrder;
    private int productQuantity;

    public AddProductOrderSteps() {
        addProductOrder = new AddProductOrder();
        productQuantity = 0;
    }

    @Given("l'utilisateur est sur la page produit")
    public void user_is_on_product_page() {
        System.out.println("L'utilisateur est sur la page produit.");
    }

    @When("l'utilisateur clique sur le bouton {string}")
    public void user_clicks_add_to_order_button(String buttonLabel) {
        if (buttonLabel.equals("Ajouter à la commande")) {
            addProductOrder.addProduct("ProduitTest");
            productQuantity = addProductOrder.getProductQuantity("ProduitTest");
        }
    }

    @Then("l'utilisateur voit une confirmation que le produit a été ajouté à la commande")
    public void user_sees_confirmation_product_added_to_order() {
        Assert.assertTrue("Le produit aurait dû être ajouté.", productQuantity > 0);
        System.out.println("Confirmation : Le produit a été ajouté à la commande.");
    }

    @Then("la quantité du produit dans la commande est de {int}")
    public void product_quantity_is(int expectedQuantity) {
        Assert.assertEquals(expectedQuantity, productQuantity);
        System.out.println("La quantité du produit dans la commande est : " + productQuantity);
    }

    @Given("l'utilisateur a déjà ajouté un produit dans la commande")
    public void user_has_already_added_product_to_order() {
        addProductOrder.addProduct("ProduitTest");
        productQuantity = addProductOrder.getProductQuantity("ProduitTest");
    }

    @Then("la quantité du produit dans la commande est augmentée de 1")
    public void product_quantity_is_increased_by_1() {
        int previousQuantity = productQuantity;
        addProductOrder.addProduct("ProduitTest");
        productQuantity = addProductOrder.getProductQuantity("ProduitTest");
        Assert.assertEquals(previousQuantity + 1, productQuantity);
        System.out.println("La quantité du produit dans la commande est maintenant : " + productQuantity);
    }
}
