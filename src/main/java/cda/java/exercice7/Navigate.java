package cda.java.exercice7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Navigate {

    private Map<String, List<String>> categories = new HashMap<>();

    public Navigate() {
        categories.put("Électronique", List.of("Téléphone", "Ordinateur portable", "Tablette"));
        categories.put("Vêtements", List.of());
        categories.put("Maison", List.of("Canapé", "Lampe", "Table"));
    }

    public List<String> getProductsByCategory(String category) throws Exception {
        if (category == null || category.isEmpty()) {
            throw new Exception("La catégorie est obligatoire.");
        }

        List<String> products = categories.getOrDefault(category, List.of());

        if (products.isEmpty()) {
            throw new Exception("Aucun produit disponible dans cette catégorie.");
        }

        return products;
    }
}
