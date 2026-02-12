package com.keyin.musicstore;

public class Product {
    private int id;
    private String productName;
    private double productPrice;
    private String productCategory;
    private String productDescription;
    private int quantityInStock;

    public Product(int id, String productName, double productPrice, String productCategory, String productDescription, int quantityInStock) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
    }

    public Product(String productName, double productPrice, String productCategory, String productDescription, int quantityInStock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCategory='" + productCategory + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", quantityInStock=" + quantityInStock +
                '}';
    }

}
