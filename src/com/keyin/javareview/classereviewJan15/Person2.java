package com.keyin.javareview.classereviewJan15;


// ---------------------
//|      Person       |
//---------------------
//| - name: String    |
//| - age: int        |
//---------------------
//| + getName(): String |
//| + getAge(): int     |
//---------------------

// - Private
// + Public
public class Person2 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
