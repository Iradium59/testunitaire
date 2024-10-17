Feature: Creation de compte
  En tant qu'utilisateur, je veux créer un compte pour pouvoir passer des commandes.

  Scenario: Création de compte avec des informations valides
    Given l'utilisateur accède au formulaire d'inscription
    When l'utilisateur entre un email, un nom d'utilisateur, et un mot de passe
    Then le compte de l'utilisateur est créé