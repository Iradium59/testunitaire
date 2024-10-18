package cda.java.exercice7;

import io.cucumber.java.en.*;

public class Search {

    @Given("l'utilisateur accède à la barre de recherche")
    public void user_accesses_search_bar() {
        System.out.println("Barre de recherche affichée.");
    }

    @When("l'utilisateur entre un mot-clé valide dans la barre de recherche")
    public void user_enters_valid_keyword_in_search_bar() {
        System.out.println("Mot-clé valide entré dans la barre de recherche.");
    }

    @Then("l'utilisateur voit une liste de résultats de recherche pertinente")
    public void user_sees_relevant_search_results() {
        System.out.println("Résultats de recherche pertinents affichés.");
    }

    @Then("l'utilisateur peut ajouter un produit à sa commande")
    public void user_can_add_product_to_order() {
        System.out.println("Produit ajouté à la commande.");
    }

    @When("l'utilisateur entre un mot-clé qui ne correspond à aucun produit")
    public void user_enters_invalid_keyword_in_search_bar() {
        System.out.println("Mot-clé sans correspondance entré.");
    }

    @Then("l'utilisateur voit un message indiquant qu'aucun résultat n'a été trouvé")
    public void user_sees_no_results_message() {
        System.out.println("Aucun résultat trouvé.");
    }

    @Then("l'utilisateur est invité à modifier son mot-clé")
    public void user_is_invited_to_modify_keyword() {
        System.out.println("Invitation à modifier le mot-clé.");
    }
}
