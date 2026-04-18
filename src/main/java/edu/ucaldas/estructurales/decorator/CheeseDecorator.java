package edu.ucaldas.estructurales.decorator;

public class CheeseDecorator extends ProductDecorator {
    public CheeseDecorator(Product product) {
        super(product);
    }

    public double getPrice() {
        return product.getPrice() + 3.5;
    }

    public String getDescription() {
        return product.getDescription() + " + queso";
    }
}
