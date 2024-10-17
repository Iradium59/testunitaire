package cda.java.exercice5;

import java.util.List;

public class Shop {
    private List<Product> products;

    public void update(Product product) {
        product.setSellIn(product.getSellIn() - 1);

        if (product.getQuality() > 0) {
            product.setQuality(product.getQuality() - 1);
        }
    }
}
