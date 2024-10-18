package cda.java.exercice7;

import java.util.HashMap;
import java.util.Map;

public class RemoveProductOrder {

    private Map<String, Integer> order = new HashMap<>();

    public void addProduct(String product) {
        order.put(product, order.getOrDefault(product, 0) + 1);
    }

    public void removeProduct(String product) throws Exception {
        if (!order.containsKey(product)) {
            throw new Exception("Le produit ne se trouve pas dans la commande.");
        }

        int currentQuantity = order.get(product);
        if (currentQuantity == 1) {
            order.remove(product);
        } else {
            order.put(product, currentQuantity - 1);
        }
    }

    public int getProductQuantity(String product) {
        return order.getOrDefault(product, 0);
    }
}
