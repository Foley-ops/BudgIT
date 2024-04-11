package com.example.budgit;

import java.util.ArrayList;
import com.example.budgit.assets.*;
import com.example.budgit.liabilities.*;
import com.example.budgit.transactions.*;

enum day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum payPeriod {
    DAILY,
    WEEKLY,
    BIWEEKLY,
    MONTHLY,
    YEARLY
}
public class userData {
    private String firstName;
    private String lastName;
    private double income;
    private double payPerPeriod;
    private ArrayList<Asset> assets;
    private ArrayList<Liability> liabilities;
    private ArrayList<Transaction> transactions;
    private double netWorth;
    private day payDay;
    private payPeriod payPeriod;

    public userData(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.assets = new ArrayList<Asset>();
        this.liabilities = new ArrayList<Liability>();
        this.transactions = new ArrayList<Transaction>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getPayPerPeriod() {
        return payPerPeriod;
    }

    public void setPayPerPeriod(double payPerPeriod) {
        this.payPerPeriod = payPerPeriod;
    }

    public Asset getAsset(int index) {
        return this.assets.get(index);
    }

    public void setAsset(Asset asset) {
        this.assets.add(asset);
    }

    public Liability getLiabilities(int index) {
        return liabilities.get(index);
    }

    public void setLiabilities(Liability liability) {
        this.liabilities.add(liability);
    }

    public Transaction getTransactions(int index) {
        return transactions.get(index);
    }

    public void setTransactions(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    public day getPayDay() {
        return payDay;
    }

    public void setPayDay(day payDay) {
        this.payDay = payDay;
    }

    public payPeriod getPayPeriod(){
        return payPeriod;
    }

    public void setPayPeriod(payPeriod payPeriod){
        this.payPeriod = payPeriod;
    }
}