Feature: Passer une commande
  En tant qu'utilisateur, je veux passer une commande pour acheter les articles que j'ai ajoutés à mon panier.

  Scenario: Passation d'une commande avec succès
    Given l'utilisateur accède au formulaire de commande
    When l'utilisateur valide la commande
    Then l'utilisateur reçoit une confirmation de commande

  Scenario: Tentative de passation d'une commande inexistante
    Given l'utilisateur accède au formulaire de commande
    When l'utilisateur tente de valider une commande qui n'existe pas
    Then une erreur est renvoyée indiquant que la commande n'existe pas
