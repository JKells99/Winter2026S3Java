package com.keyin.musicstore;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    List<Product> productHistory;

    // Constructors
    public Customer(int id, String firstName, String lastName, String email) {
        super(id, firstName, lastName, email, "CUSTOMER");
        this.productHistory = new ArrayList<>();
    }

    public Customer(String firstName, String lastName, String email) {
        super(firstName, lastName, email, "CUSTOMER");
        this.productHistory = new ArrayList<>();
    }

    public Customer() {
        this.productHistory = new ArrayList<>();
    }
    // Get and Set Methods
    public List<Product> getProductHistory() {
        return productHistory;
    }

    public void setProductHistory(List<Product> productHistory) {
        this.productHistory = productHistory;
    }

    // Methods

    public void addProductToHistory(Product product){
        productHistory.add(product);
    }
    public void removeProductFromHistory(Product product){
        productHistory.remove(product);
    }

    @Override
    public String toString() {
        return "Customer{" + "productHistory=" + productHistory + "} " + super.toString();
    }
}
