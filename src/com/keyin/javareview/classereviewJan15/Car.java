package com.keyin.javareview.classereviewJan15;

//-------------------------
//        |        Car            |
//        -------------------------
//        | - make: String        |
//        | - model: String       |
//        | - year: int
//        |
//        -------------------------
//        | + Car(make, model, year) |
//        | + start(): void       |
//        -------------------------

public class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Vroom!");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
