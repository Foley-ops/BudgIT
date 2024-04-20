package com.example.budgit.datamanagement;

import com.example.budgit.assets.*;
public class AssetManagement {
    private AssetManagement(){}

    public static Asset createAsset(int id, double value, double interest, String name){
        WriteCache.writeToCache();
        return new Asset(id, value, interest, name);
    }

    public static Car CreateCar(int id, double value, double interest, String name, int age, String model, String make, double mpg, Condition condition){
        WriteCache.writeToCache();
        return new Car(id, value, interest, name, age, model, make, mpg, condition);
    }

    public static InvestmentAccount createInvestmentAccount(int id, double value, double interest, String name, String brokerage){
        WriteCache.writeToCache();
        return new InvestmentAccount(id, value, interest, name, brokerage);
    }

    public static Property createProperty(int id, double value, double interest, String name, int age, String address){
        WriteCache.writeToCache();
        return new Property(id, value, interest, name, age, address);
    }

    public static SavingsAccount createSavingsAccount(int id, double value, double interest, String name, String bank){
        WriteCache.writeToCache();
        return new SavingsAccount(id, value, interest, name, bank);
    }
}