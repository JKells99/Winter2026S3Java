package com.keyin.musicstore;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Invoice {
    private int invoiceId;
    private Customer customer;
    private Employee employee;
    private ArrayList<Product> productsBought;
    private double totalPrice;
    private LocalDateTime invoiceDate;

    public Invoice(int invoiceId, Customer customer, Employee employee, double totalPrice) {
        this.invoiceId = invoiceId;
        this.customer = customer;
        this.employee = employee;
        this.productsBought = new ArrayList<>();
        this.totalPrice = totalPrice;
        this.invoiceDate = LocalDateTime.now();
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<Product> getProductsBought() {
        return productsBought;
    }

    public void setProductsBought(ArrayList<Product> productsBought) {
        this.productsBought = productsBought;
    }

    public double getTotalPrice() {
        for (Product product : productsBought) {
            int quantity = product.getQuantityInStock();
            totalPrice += product.getProductPrice() * quantity;
        }
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", customer=" + customer +
                ", employee=" + employee +
                ", productsBought=" + productsBought +
                ", totalPrice=" + totalPrice +
                ", invoiceDate=" + invoiceDate +
                '}';
    }
}
