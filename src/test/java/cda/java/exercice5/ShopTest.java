package cda.java.exercice5;

import org.junit.Assert;
import org.junit.Test;

public class ShopTest {

    @Test
    public void update_WhenNormalProduct_DecrementsSellInAndQuality() {
        // Arrange
        Product product = new Product("normal", "Produit normal", 10, 20);
        Shop shop = new Shop();

        // Act
        shop.update(product);

        // Assert
        Assert.assertEquals(9, product.getSellIn());
        Assert.assertEquals(19, product.getQuality());
    }

    @Test
    public void update_WhenQualityIsZero_QualityDoesNotBecomeNegative() {
        // Arrange
        Product product = new Product("normal", "Produit normal", 5, 0);
        Shop shop = new Shop();

        // Act
        shop.update(product);

        // Assert
        Assert.assertEquals(0, product.getQuality());
    }

    @Test
    public void update_WhenSellInIsZero_QualityDegradesTwiceAsFast() {
        // Arrange
        Product product = new Product("normal", "Produit normal", 0, 10);
        Shop shop = new Shop();

        // Act
        shop.update(product);

        // Assert
        Assert.assertEquals(8, product.getQuality());
    }

    @Test
    public void update_WhenQualityIs50_QualityDoesNotExceedMax() {
        // Arrange
        Product product = new Product("normal", "Produit Normal", 10, 52);
        Shop shop = new Shop();

        // Act
        shop.update(product);

        // Assert
        Assert.assertEquals(50, product.getQuality());
    }

    @Test
    public void update_WhenAgedBrie_QualityIncreasesOverTime() {
        // Arrange
        Product product = new Product("aged", "Brie vieilli", 10, 20);
        Shop shop = new Shop();

        // Act
        shop.update(product);

        // Assert
        Assert.assertEquals(21, product.getQuality());
    }

    @Test
    public void update_WhenDairyProduct_QualityDegradesTwiceAsFast() {
        // Arrange
        Product product = new Product("dairy", "Produit laitier", 10, 20);
        Shop shop = new Shop();

        // Act
        shop.update(product);

        // Assert
        Assert.assertEquals(18, product.getQuality());
    }
}
