Feature: Connexion à un compte
  En tant qu'utilisateur, je veux me connecter à mon compte pour accéder et passer des commandes.

  Scenario: Connexion réussie avec des informations valides
    Given l'utilisateur accède au formulaire de connexion
    When l'utilisateur entre un nom d'utilisateur "validuser" et un mot de passe "validpassword"
    Then l'utilisateur est redirigé vers la page d'accueil
    And l'utilisateur voit son tableau de bord

  Scenario: Connexion échouée avec des informations invalides
    Given l'utilisateur accède au formulaire de connexion
    When l'utilisateur entre un nom d'utilisateur "invaliduser" ou un mot de passe "invalidpassword" incorrect
    Then l'utilisateur voit un message d'erreur indiquant que les informations sont incorrectes
    And l'utilisateur est invité à réessayer
