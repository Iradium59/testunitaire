package cda.java.exercice7;

import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class SearchSteps {

    private Search search;
    private String lastErrorMessage;
    private List<String> searchResults;

    public SearchSteps() {
        search = new Search();
        lastErrorMessage = null;
        searchResults = null;
    }

    @Given("l'utilisateur accède à la barre de recherche")
    public void user_accesses_search_bar() {
        System.out.println("Barre de recherche affichée.");
    }

    @When("l'utilisateur entre un mot-clé {string}")
    public void user_enters_keyword(String keyword) {
        try {
            searchResults = search.searchProduct(keyword);
        } catch (Exception e) {
            lastErrorMessage = e.getMessage();
        }
    }

    @Then("l'utilisateur voit une liste de résultats de recherche pertinente")
    public void user_sees_relevant_search_results() {
        Assert.assertNotNull("Il devrait y avoir des résultats de recherche.", searchResults);
        Assert.assertTrue("Il devrait y avoir au moins un résultat de recherche.", searchResults.size() > 0);
    }

    @Then("l'utilisateur peut ajouter un produit à sa commande")
    public void user_can_add_product_to_order() {
        Assert.assertNotNull("L'utilisateur aurait dû pouvoir ajouter un produit à la commande.", searchResults);
        System.out.println("Produit ajouté à la commande.");
    }

    @Then("l'utilisateur voit un message indiquant qu'aucun résultat n'a été trouvé")
    public void user_sees_no_results_message() {
        Assert.assertEquals("Aucun produit trouvé pour ce mot-clé.", lastErrorMessage);
    }

    @Then("l'utilisateur est invité à modifier son mot-clé")
    public void user_is_invited_to_modify_keyword() {
        Assert.assertNotNull("L'utilisateur devrait être invité à modifier son mot-clé.", lastErrorMessage);
        System.out.println("Invitation à modifier le mot-clé.");
    }
}
