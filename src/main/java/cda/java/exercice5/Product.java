package cda.java.exercice5;

public class Product {
    private String type;
    private String name;
    private int sellIn;
    private int quality;


    public Product(String type, String name, int sellIn, int quality) {
        this.type = type;
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return 1;
    }

    public int getQuality() {
        return 1;
    }
}
