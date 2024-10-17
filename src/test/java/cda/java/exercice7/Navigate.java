package cda.java.exercice7;

import io.cucumber.java.en.*;

public class Navigate {

    @Given("l'utilisateur accède à la page de catégories")
    public void user_accesses_category_page() {
        System.out.println("Page de catégories affichée.");
    }

    @Then("l'utilisateur voit une liste de catégories de produits")
    public void user_sees_list_of_categories() {
        System.out.println("Liste des catégories de produits affichée.");
    }

    @Given("l'utilisateur est sur la page de catégories")
    public void user_is_on_category_page() {
        System.out.println("Utilisateur est sur la page de catégories.");
    }

    @When("l'utilisateur clique sur une catégorie")
    public void user_clicks_on_a_category() {
        // Code pour simuler le clic sur une catégorie
        System.out.println("Utilisateur a cliqué sur une catégorie.");
    }

    @Then("l'utilisateur voit les produits correspondants à cette catégorie")
    public void user_sees_products_in_category() {
        System.out.println("Produits correspondants à la catégorie affichés.");
    }
}
