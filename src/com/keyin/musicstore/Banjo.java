package com.keyin.musicstore;

public class Banjo extends Instrument{
    private int numberOfStrings;

    public Banjo(int id, String productName, double productPrice, String productDescription, int quantityInStock, String instrumentBrand, int numberOfStrings) {
        super(id, productName, productPrice, "Banjo", productDescription, quantityInStock, instrumentBrand);
        this.numberOfStrings = numberOfStrings;
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
