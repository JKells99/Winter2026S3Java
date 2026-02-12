package com.keyin.musicstore;

import java.util.ArrayList;

public class MusicStore {
    private String musicStoreName;
    private String musicStoreAddress;
    private String musicStorePhoneNumber;
    private ArrayList<Product> products;

    public MusicStore(String musicStoreName, String musicStoreAddress, String musicStorePhoneNumber) {
        this.musicStoreName = musicStoreName;
        this.musicStoreAddress = musicStoreAddress;
        this.musicStorePhoneNumber = musicStorePhoneNumber;
        products = new ArrayList<>();
    }

    public MusicStore() {
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

    public void sellProduct(String productName, int quantity){
        double totalPrice;
        for (Product product: products){
            if (product.getProductName().equalsIgnoreCase(productName)){
                product.setQuantityInStock(product.getQuantityInStock()-quantity);
                totalPrice = product.getProductPrice()*quantity;
                System.out.println("Product sold successfully!");
                System.out.println("Total Price: "+totalPrice);
                break;
            }
        }
    }



    @Override
    public String toString() {
        return "MusicStore{" +
                "musicStoreName='" + musicStoreName + '\'' +
                ", musicStoreAddress='" + musicStoreAddress + '\'' +
                ", musicStorePhoneNumber='" + musicStorePhoneNumber + '\'' +
                ", products=" + products +
                '}';
    }
}
