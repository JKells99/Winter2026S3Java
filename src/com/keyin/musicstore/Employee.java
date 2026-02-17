package com.keyin.musicstore;

public class Employee extends Person {
    public int yearsOfExperience;

    public Employee(int id, String firstName, String lastName, String email, int yearsOfExperience) {
        super(id, firstName, lastName, email, "EMPLOYEE");
        this.yearsOfExperience = yearsOfExperience;
    }

    public Employee(String firstName, String lastName, String email, int yearsOfExperience) {
        super(firstName, lastName, email, "EMPLOYEE");
        this.yearsOfExperience = yearsOfExperience;
    }

    public Employee(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public Employee(){

    }
}
