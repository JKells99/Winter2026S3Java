package com.keyin.musicstore;

public class Guitar extends Instrument{

    private String guitarType;

    public Guitar(int id, String productName, double productPrice, String productDescription, int quantityInStock, String instrumentBrand, String guitarType) {
        super(id, productName, productPrice, "Guitar", productDescription, quantityInStock, instrumentBrand);
        this.guitarType = guitarType;
    }





    public String getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "guitarType='" + guitarType + '\'' +
                "} " + super.toString();
    }
}
