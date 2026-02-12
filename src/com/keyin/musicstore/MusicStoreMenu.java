package com.keyin.musicstore;

public class MusicStoreMenu {
    public static void main(String[] args) {
        Product product2 = new Product(2, "Yamaha Grand Piano", 12999.99, "Piano", "88-key grand piano with weighted keys", 5);
        Product product3 = new Product(3, "Ludwig Classic Maple Drums", 2499.99, "Drum Set", "5-piece shell pack with hardware", 20);
        Product product4 = new Product(4, "Pink Floyd - The Wall Vinyl", 34.99, "Vinyl", "2LP remaster on 180g vinyl", 100);
        Product product5 = new Product(5, "The Beatles - Abbey Road CD", 12.99, "CD", "Remastered stereo CD", 50);
        Product product6 = new Product(6, "David Bowie - Ziggy Stardust LP", 29.99, "Vinyl", "Classic 1972 release on 180g vinyl", 25);
        Product product7 = new Product(7, "Michael Jackson - Thriller Cassette", 9.99, "Cassette", "Original 1982 cassette tape", 100);
        Guitar guitar = new Guitar(1, "Fender Stratocaster", 999.99, "Electric guitar with alder body and maple neck", 10, "Fender", "Electric");
        Banjo banjo = new Banjo(10,"5 String Banjo",399.99,"A 5 string bluegrass banjo",10,"Alabama",5);
        MusicStore musicStore = new MusicStore("Music Store 1","123 Water Street", "123-456-7890");

        musicStore.addProduct(guitar);
        musicStore.addProduct(banjo);
        musicStore.addProduct(product2);
        musicStore.addProduct(product3);
        musicStore.addProduct(product4);
        musicStore.addProduct(product5);
        musicStore.addProduct(product6);
        musicStore.addProduct(product7);

        musicStore.sellProduct("Fender Stratocaster", 2);

        musicStore.printInventory();


    }
}
