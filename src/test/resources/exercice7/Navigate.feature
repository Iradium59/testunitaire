Feature: Navigation par catégorie de produits
  En tant qu'utilisateur, je veux naviguer par catégorie de produits pour découvrir ce qui est disponible.

  Scenario: Accès à la page des catégories
    Given l'utilisateur accède à la page de catégories
    Then l'utilisateur voit une liste de catégories de produits

  Scenario: Navigation dans une catégorie spécifique
    Given l'utilisateur est sur la page de catégories
    When l'utilisateur clique sur une catégorie
    Then l'utilisateur voit les produits correspondants à cette catégorie
