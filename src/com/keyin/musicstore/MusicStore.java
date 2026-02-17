package com.keyin.musicstore;

import java.util.ArrayList;

public class MusicStore {
    private String musicStoreName;
    private String musicStoreAddress;
    private String musicStorePhoneNumber;
    private ArrayList<Product> products;
    private ArrayList<Customer> customers;
    private ArrayList<Invoice> invoices;
    private ArrayList<Employee> employees;


    public MusicStore(String musicStoreName, String musicStoreAddress, String musicStorePhoneNumber) {
        this.musicStoreName = musicStoreName;
        this.musicStoreAddress = musicStoreAddress;
        this.musicStorePhoneNumber = musicStorePhoneNumber;
        products = new ArrayList<>();
        customers = new ArrayList<>();
        invoices = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public MusicStore() {
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public String getMusicStoreName() {
        return musicStoreName;
    }

    public void setMusicStoreName(String musicStoreName) {
        this.musicStoreName = musicStoreName;
    }

    public String getMusicStoreAddress() {
        return musicStoreAddress;
    }

    public void setMusicStoreAddress(String musicStoreAddress) {
        this.musicStoreAddress = musicStoreAddress;
    }

    public String getMusicStorePhoneNumber() {
        return musicStorePhoneNumber;
    }

    public void setMusicStorePhoneNumber(String musicStorePhoneNumber) {
        this.musicStorePhoneNumber = musicStorePhoneNumber;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    // Methods
    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product added successfully!");
    }

    public void addCustomer(Customer customer){
        System.out.println("Customer added successfully!");
        customers.add(customer);
    }
    public void removeCustomer(Customer customer){
        System.out.println( "Customer removed successfully :( ");
        customers.remove(customer);
    }
    public void addProductToCustomerHistory(Product product, Customer customer){
        System.out.println("Product added to customer history successfully!");
        customer.addProductToHistory(product);
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public void printCustomerList(){
        for (Customer customer: customers){
            System.out.printf("Customer Name: " + customer.getFirstName() + " " + customer.getLastName() + "\n");
            System.out.println("Customer Email Address: " + customer.getEmail());
            System.out.println("Product History: ");
            for (Product product: customer.getProductHistory()){
                System.out.println( "-" + product.getProductName() + " $"+product.getProductPrice());

            }
        }
    }

    // Print Method
    public void printInventory(){
        for (Product product: products){
            System.out.println("=======================");
            System.out.println("Product ID "+product.getId());
            System.out.println("=======================");
            System.out.println("Product Name: "+ product.getProductName());
            System.out.println("Product Price: "+ product.getProductPrice());
            System.out.println("Product Category: "+ product.getProductCategory());
            System.out.println("Product Description: "+ product.getProductDescription());
            System.out.println("Quantity in Stock: "+ product.getQuantityInStock());
            if (product instanceof Instrument) System.out.println("Instrument Brand: "+ ((Instrument) product).getInstrumentBrand());
            if (product instanceof Guitar) System.out.println("Guitar Type: "+ ((Guitar) product).getGuitarType());
            if (product instanceof Piano) System.out.println("Number of Keys: "+ ((Piano) product).getNumberOfKeys());
            if (product instanceof Banjo ) System.out.println("Number of Strings: "+ ((Banjo) product).getNumberOfStrings());
            System.out.println();

        }
    }

    public void searchProduct(String productName){
        boolean found = false;

        for (Product product: products){
            if (product.getProductName().equalsIgnoreCase(productName)) {
                System.out.println("Product found!");
                System.out.println("Product ID " + product.getId());
                System.out.println("Product Name " + product.getProductName());
                System.out.println("Product Price " + product.getProductPrice());
                found= true;
                break;
            }
        }

        if (!found) System.out.println("Product not found!");
    }

    public void removeProduct(int productId){
        for (Product product: products){
            if (product.getId() == productId){
                products.remove(product);
                System.out.println("Product removed successfully!");
                break;
            }
        }
    }

    public void sellProduct(Customer customer, Product product, int quantity,Employee employee){
        int invoiceId = invoices.size()+1;
        // Update Product Quantity
        if(product.getQuantityInStock() < quantity) System.out.println("Not enough stock to sell!");

        product.setQuantityInStock(product.getQuantityInStock() - quantity);

        Invoice invoice = new Invoice(invoiceId, customer, employee, product.getProductPrice() * quantity);

        // add invoice to list of invoices for the store
        invoices.add(invoice);

    }

    public void sellProductExample2(String customerEmail, String productName, int quantity, String employeeName){
        Customer customer = new Customer();
        Product product = new Product();
        Employee employee = new Employee();
        for(Customer customerSearch: customers){
            if(customer.getEmail().equalsIgnoreCase(customerEmail)){
                customerSearch = customer;
            }
        }

        for(Product productSearch: products){
            if(productSearch.getProductName().equalsIgnoreCase(productName)){
                product = productSearch;
            }
        }
        for (Employee employeeSearch: employees){
            if (employeeSearch.getFirstName().equalsIgnoreCase(employeeName)){
                employee = employeeSearch;
            }
        }

        sellProduct(customer, product, quantity, employee);


    }

    public void printCustomerHistoryByEmail(String email){
        for(Customer customer: customers){
            if(customer.getEmail().equalsIgnoreCase(email)){
                System.out.println("Customer History For: " + customer.getFirstName() + " " + customer.getLastName());
                for(Product product: customer.getProductHistory()){
                    System.out.println("-"+product.getProductName()+" $"+product.getProductPrice());
                }
            }
            else System.out.println("Customer not found!");
        }
    }

    public void getTotalCustomerSpend(String email){
        double total = 0;
        Customer customer = new Customer();
        for(Customer customer1: customers){
            if(customer1.getEmail().equalsIgnoreCase(email)){
                customer = customer1;
                for(Product product: customer.getProductHistory()){
                    total += product.getProductPrice();
                }
            }
        }
        System.out.println("Total Spend For Customer: " + customer.getFirstName()  + " $" + total);
    }

    public void getTotalStoreInventoryValue(){
        double total = 0;
        for(Product product: products){
            int quantityInStock = product.getQuantityInStock();
            if(quantityInStock <= 0) continue;

            total += product.getProductPrice() * quantityInStock;

        }

        System.out.printf("Total For Inventory: $%.2f%n", total);

    }


    @Override
    public String toString() {
        return "MusicStore{" +
                "musicStoreName='" + musicStoreName + '\'' +
                ", musicStoreAddress='" + musicStoreAddress + '\'' +
                ", musicStorePhoneNumber='" + musicStorePhoneNumber + '\'' +
                ", products=" + products +
                ", customers=" + customers +
                ", invoices=" + invoices +
                '}';
    }

    public void removeProductFromCustomer(Product product, Customer customer) {
        System.out.println("Product removed from customer history successfully:(");
        customer.removeProductFromHistory(product);
    }
}
