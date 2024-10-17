package cda.java.exercice5;

import java.util.List;

public class Shop {
    private List<Product> products;

    public void update(Product product) {
        product.setSellIn(product.getSellIn() - 1);

        if (product.getSellIn() < 0) {
            if (product.getQuality() > 1) {
                product.setQuality(product.getQuality() - 2);
            } else {
                product.setQuality(0);
            }
        } else {
            if (product.getQuality() > 0) {
                product.setQuality(product.getQuality() - 1);
            }
        }
    }
}
