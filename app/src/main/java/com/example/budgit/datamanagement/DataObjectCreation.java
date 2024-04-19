package com.example.budgit.datamanagement;

import com.example.budgit.assets.Asset;
import com.example.budgit.expenses.*;
import com.example.budgit.liabilities.*;

enum ExpenseType {
    DEFAULT
}

enum AssetType{
    DEFAULT,
    CAR,
    INVESTMENTACCONT,
    PROPERTY,
    SAVINGSACCOUNT,
}

enum LiabilityType{
    DEFAULT,
    CARNOTE,
    CREDITCARD,
    MORTGAGE,
    PERSONALOAN,
    STUDENTLOAN
}

public class DataObjectCreation {
    private DataObjectCreation(){};

    public static Expense createExpense(int id, String name, double cost, int day, int month, ExpenseType expenseType){
        switch (expenseType){
            case DEFAULT:
                break;
        }
        return null;
    }

    public static Asset createAsset(int id, String name, double value, int day, int month, AssetType assetType){
        switch (assetType){
            case DEFAULT:
                break;
            case CAR:
                break;
            case INVESTMENTACCONT:
                break;
            case PROPERTY:
                break;
            case SAVINGSACCOUNT:
                break;
        }
        return null;
    }

    public static Liability createLiability(int id, double balance, double interestRate, String name, LiabilityType liabilityType){
        switch (liabilityType){
            case DEFAULT:
                WriteCache.writeToCache();
                return new Liability(id, balance, interestRate, name);
            case CARNOTE:
                int term = 0; //get from UI
                return LiabilityManagement.createCarNote(id, balance, interestRate, name, term);
            case CREDITCARD:
                int age = 0; //get from UI
                return LiabilityManagement.createCreditCard(id, balance, interestRate, name, age);
            case MORTGAGE:
                int termMortgage = 0; //get from UI
                return LiabilityManagement.createMortgage(id, balance, interestRate, name, termMortgage);
            case PERSONALOAN:
                int agePLoan = 0; //get from UI
                String reason = ""; //get from UI
                return LiabilityManagement.createPersonalLoan(id, balance, interestRate, name, agePLoan, reason);
            case STUDENTLOAN:
                String degree = ""; //get from UI
                int ageSloan = 0; //get from UI
                boolean federal = false; //get from UI
                boolean subsidized = false; //get from UI
                return LiabilityManagement.createStudentLoan(id, balance, interestRate, name, degree, ageSloan, federal, subsidized);
        }
        return null;
    }
}