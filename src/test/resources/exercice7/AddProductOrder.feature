Feature: Ajouter des produits à la commande
  En tant qu'utilisateur, je veux ajouter des produits à la commande pour acheter des articles.

  Scenario: Ajout d'un produit à la commande depuis la page produit
    Given l'utilisateur est sur la page produit
    When l'utilisateur clique sur le bouton "Ajouter à la commande"
    Then l'utilisateur voit une confirmation que le produit a été ajouté à la commande

  Scenario: Augmentation de la quantité d'un produit déjà présent dans la commande
    Given l'utilisateur a déjà ajouté un produit dans la commande
    When l'utilisateur clique à nouveau sur le bouton "Ajouter à la commande"
    Then la quantité du produit dans la commande est augmentée de 1
