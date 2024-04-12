package com.example.budgit.assets;

enum condition{
    JUNK,
    BAD,
    DECENT,
    GOOD,
    GREAT,
    LIKENEW
}

public class Car extends Asset{
    private int age;
    private String model;
    private String make;
    private double mpg;
    private condition condition;

    public Car(int id, double value, double interest, String name, int age, String model, String make, double mpg, condition condition) {
        super(id, value, interest, name);
        this.age = age;
        this.model = model;
        this.make = make;
        this.mpg = mpg;
        this.condition = condition;
    }

    public Car(int age, String model, String make, double mpg, condition condition) {
        this.age = age;
        this.model = model;
        this.make = make;
        this.mpg = mpg;
        this.condition = condition;
    }

    public Car(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public condition getCondition() {
        return condition;
    }

    public void setCondition(condition condition) {
        this.condition = condition;
    }
}