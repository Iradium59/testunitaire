package cda.java.exercice7;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class ValidOrderSteps {

    private ValidOrder validOrder;
    private String lastErrorMessage;
    private String orderDetails;

    public ValidOrderSteps() {
        validOrder = new ValidOrder();
        lastErrorMessage = null;
        orderDetails = null;
    }

    @Given("l'utilisateur accède au formulaire de commande")
    public void user_accesses_order_form() {
        System.out.println("Formulaire de commande affiché.");
    }

    @When("l'utilisateur valide la commande")
    public void user_validates_order() {
        try {
            orderDetails = validOrder.validateOrder("order123");
        } catch (Exception e) {
            lastErrorMessage = e.getMessage();
        }
    }

    @Then("l'utilisateur reçoit une confirmation de commande")
    public void user_receives_order_confirmation() {
        Assert.assertNotNull("La commande aurait dû être validée.", orderDetails);
        System.out.println("Confirmation : La commande a été validée.");
    }

    @Then("l'utilisateur voit les détails de sa commande")
    public void user_sees_order_details() {
        Assert.assertNotNull("Les détails de la commande auraient dû être affichés.", orderDetails);
        System.out.println("Détails de la commande : " + orderDetails);
    }

    @When("l'utilisateur tente de valider une commande qui n'existe pas")
    public void user_tries_to_validate_nonexistent_order() {
        try {
            orderDetails = validOrder.validateOrder("order999");
        } catch (Exception e) {
            lastErrorMessage = e.getMessage();
        }
    }

    @Then("une erreur est renvoyée indiquant que la commande n'existe pas")
    public void error_order_does_not_exist_is_returned() {
        Assert.assertEquals("La commande n'existe pas.", lastErrorMessage);
    }

    @Then("l'utilisateur est invité à revenir à la page d'accueil")
    public void user_is_redirected_to_homepage() {
        Assert.assertNotNull("L'utilisateur devrait être redirigé à la page d'accueil.", lastErrorMessage);
        System.out.println("L'utilisateur est redirigé vers la page d'accueil.");
    }
}
