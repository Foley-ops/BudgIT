package com.example.budgit.liabilities;

public class Liability {
    private int id;
    private double balance;
    private double interestRate;
    private String name;

    public Liability(int id, double balance, double interestRate, String name) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
        this.name = name;
    }

    public Liability(int id){
        this.id = id;
    }
}