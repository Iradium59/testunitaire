Feature: Création de compte
  En tant qu'utilisateur, je veux créer un compte pour pouvoir passer des commandes.

  Scenario: Création de compte avec des informations valides
    Given l'utilisateur accède au formulaire d'inscription
    When l'utilisateur entre un email, un nom d'utilisateur, et un mot de passe
    Then le compte de l'utilisateur est créé
    And l'utilisateur reçoit une confirmation

  Scenario: Création de compte avec un email déjà existant
    Given l'utilisateur accède au formulaire d'inscription
    When l'utilisateur entre un email qui existe déjà dans la base de données
    Then une erreur indiquant que l'email est déjà utilisé est renvoyée
