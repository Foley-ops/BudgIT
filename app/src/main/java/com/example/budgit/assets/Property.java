package com.example.budgit.assets;

import com.example.budgit.assets.*;

public class Property extends Asset {
    private int age;
    private String address;

    public Property(int age, String address) {
        super();
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
