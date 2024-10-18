package cda.java.exercice7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Search {

    private Map<String, String> products = new HashMap<>();

    public Search() {
        products.put("laptop", "Ordinateur portable");
        products.put("phone", "Téléphone portable");
        products.put("tablet", "Tablette");
    }

    public List<String> searchProduct(String keyword) throws Exception {
        if (keyword == null || keyword.isEmpty()) {
            throw new Exception("Le mot-clé de recherche est obligatoire.");
        }

        List<String> results = products.entrySet().stream()
                .filter(entry -> entry.getKey().contains(keyword.toLowerCase()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        if (results.isEmpty()) {
            throw new Exception("Aucun produit trouvé pour ce mot-clé.");
        }

        return results;
    }
}
