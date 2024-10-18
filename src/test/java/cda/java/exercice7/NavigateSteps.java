package cda.java.exercice7;

import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class NavigateSteps {

    private Navigate navigate;
    private String lastErrorMessage;
    private List<String> categoryProducts;

    public NavigateSteps() {
        navigate = new Navigate();
        lastErrorMessage = null;
        categoryProducts = null;
    }

    @Given("l'utilisateur accède à la page de catégories")
    public void user_accesses_category_page() {
        System.out.println("Page de catégories affichée.");
    }

    @When("l'utilisateur clique sur une catégorie {string}")
    public void user_clicks_on_category(String category) {
        try {
            categoryProducts = navigate.getProductsByCategory(category);
        } catch (Exception e) {
            lastErrorMessage = e.getMessage();
        }
    }

    @Then("l'utilisateur voit les produits correspondants à cette catégorie")
    public void user_sees_products_in_category() {
        Assert.assertNotNull("Il devrait y avoir des produits dans cette catégorie.", categoryProducts);
        Assert.assertTrue("Il devrait y avoir au moins un produit dans cette catégorie.", categoryProducts.size() > 0);
    }

    @Then("l'utilisateur peut ajouter un produit de la catégorie à sa commande")
    public void user_can_add_product_from_category_to_order() {
        Assert.assertNotNull("Il devrait y avoir des produits à ajouter.", categoryProducts);
        System.out.println("Produit de la catégorie ajouté à la commande.");
    }

    @Then("un message indique qu'aucun produit n'est disponible dans cette catégorie")
    public void user_sees_no_products_in_category() {
        Assert.assertEquals("Aucun produit disponible dans cette catégorie.", lastErrorMessage);
    }

    @Then("l'utilisateur est invité à choisir une autre catégorie")
    public void user_is_invited_to_choose_another_category() {
        Assert.assertNotNull("L'utilisateur devrait être invité à choisir une autre catégorie.", lastErrorMessage);
        System.out.println("Invitation à choisir une autre catégorie.");
    }
}
