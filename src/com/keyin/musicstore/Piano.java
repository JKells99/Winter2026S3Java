package com.keyin.musicstore;

public class Piano extends Instrument{
    private int numberOfKeys;

    public Piano(int id, String productName, double productPrice, String productDescription, int quantityInStock, String instrumentBrand, int numberOfKeys) {
        super(id, productName, productPrice, "Piano", productDescription, quantityInStock, instrumentBrand);
        this.numberOfKeys = numberOfKeys;
    }

    public Piano(String productName, double productPrice, String productDescription, int quantityInStock, String instrumentBrand, int numberOfKeys) {
        super(productName, productPrice, "Piano", productDescription, quantityInStock, instrumentBrand);
        this.numberOfKeys = numberOfKeys;
    }

    public Piano(String instrumentBrand, int numberOfKeys) {
        super(instrumentBrand);
        this.numberOfKeys = numberOfKeys;
    }
    public int getNumberOfKeys() {
        return numberOfKeys;
    }
    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
    @Override
    public String toString() {
        return super.toString() + "Piano{" + "numberOfKeys=" + numberOfKeys + '}';
    }
}
