package cda.java.exercice7;

import java.util.HashMap;
import java.util.Map;

public class ValidOrder {

    private Map<String, String> orders = new HashMap<>();

    public ValidOrder() {
        orders.put("order123", "Détails de la commande : 3 articles, total : 100€");
    }

    public String validateOrder(String orderId) throws Exception {
        if (orderId == null || orderId.isEmpty()) {
            throw new Exception("La commande n'existe pas.");
        }

        if (!orders.containsKey(orderId)) {
            throw new Exception("La commande n'existe pas.");
        }

        return orders.get(orderId);
    }
}
