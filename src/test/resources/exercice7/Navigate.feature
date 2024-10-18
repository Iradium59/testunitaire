Feature: Navigation par catégorie de produits
  En tant qu'utilisateur, je veux naviguer par catégorie de produits pour découvrir ce qui est disponible.

  Scenario: Accès à la page des catégories
    Given l'utilisateur accède à la page de catégories
    When l'utilisateur clique sur une catégorie "Électronique"
    Then l'utilisateur voit les produits correspondants à cette catégorie
    And l'utilisateur peut ajouter un produit de la catégorie à sa commande

  Scenario: Accès à une catégorie vide
    Given l'utilisateur accède à la page de catégories
    When l'utilisateur clique sur une catégorie "Vêtements"
    Then un message indique qu'aucun produit n'est disponible dans cette catégorie
    And l'utilisateur est invité à choisir une autre catégorie
