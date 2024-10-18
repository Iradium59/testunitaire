package cda.java.exercice7;

import java.util.HashMap;
import java.util.Map;

public class AddProductOrder {

    private Map<String, Integer> order = new HashMap<>();

    public void addProduct(String product) {
        if (order.containsKey(product)) {
            order.put(product, order.get(product) + 1);
        } else {
            order.put(product, 1);
        }
    }

    public int getProductQuantity(String product) {
        return order.getOrDefault(product, 0);
    }
}
