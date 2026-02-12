package com.keyin.musicstore;

public class Instrument extends Product{
    private String instrumentBrand;

    public Instrument(int id, String productName, double productPrice, String productCategory, String productDescription, int quantityInStock, String instrumentBrand) {
        super(id, productName, productPrice, productCategory, productDescription, quantityInStock);
        this.instrumentBrand = instrumentBrand;
    }

    public Instrument(String productName, double productPrice, String productCategory, String productDescription, int quantityInStock, String instrumentBrand) {
        super(productName, productPrice, productCategory, productDescription, quantityInStock);
        this.instrumentBrand = instrumentBrand;
    }

    public Instrument(String instrumentBrand) {
        this.instrumentBrand = instrumentBrand;
    }

    public String getInstrumentBrand() {
        return instrumentBrand;
    }

    public void setInstrumentBrand(String instrumentBrand) {
        this.instrumentBrand = instrumentBrand;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "instrumentBrand='" + instrumentBrand + '\'' +
                "} " + super.toString();
    }
}
