Feature: Suppression de produits de la commande
  En tant qu'utilisateur, je veux supprimer des produits de la commande pour gérer mes articles.

  Scenario: Diminution de la quantité d'un produit dans la commande
    Given l'utilisateur a ajouté un produit dans la commande
    When l'utilisateur clique sur le bouton "Supprimer" à côté du produit
    Then la quantité du produit est diminuée de 1
    And le total de la commande est mis à jour

  Scenario: Suppression d'un produit de la commande lorsqu'il ne reste plus d'articles
    Given l'utilisateur a ajouté un produit dans la commande avec une seule unité
    When l'utilisateur clique sur le bouton "Supprimer" à côté du produit
    Then le produit est retiré de la commande
    And l'utilisateur voit un message de confirmation de suppression
