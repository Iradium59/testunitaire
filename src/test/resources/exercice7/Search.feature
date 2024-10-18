Feature: Recherche de produits
  En tant qu'utilisateur, je veux rechercher des produits pour trouver ce dont j'ai besoin rapidement.

  Scenario: Recherche avec un mot-clé valide
    Given l'utilisateur accède à la barre de recherche
    When l'utilisateur entre un mot-clé "laptop"
    Then l'utilisateur voit une liste de résultats de recherche pertinente
    And l'utilisateur peut ajouter un produit à sa commande

  Scenario: Recherche sans résultat pertinent
    Given l'utilisateur accède à la barre de recherche
    When l'utilisateur entre un mot-clé "inconnu"
    Then l'utilisateur voit un message indiquant qu'aucun résultat n'a été trouvé
    And l'utilisateur est invité à modifier son mot-clé
