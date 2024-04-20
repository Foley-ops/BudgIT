package com.example.budgit.datamanagement;

import com.example.budgit.assets.Asset;
import com.example.budgit.assets.Condition;
import com.example.budgit.expenses.*;
import com.example.budgit.liabilities.*;
/*
NOTE THIS CLASS IS PROBABLY REDUNDANT SINCE ALL FUNCTIONS CAN BE CALLED FROM THE MAIN ACTIVITIES ANYWAY
*/
public class DataObjectCreation {
    private DataObjectCreation(){};

    public static Expense createExpense(int id, double cost, int day, int month, String name, ExpenseType expenseType){
        switch (expenseType){
            case DEFAULT:
                return ExpenseManagement.createExpense(id, cost, day, month, name);
        }
        return null;
    }

    public static Asset createAsset(int id, double value, double interest, String name, AssetType assetType){
        switch (assetType){
            case DEFAULT:
                return AssetManagement.createAsset(id, value, interest, name);
            case CAR:
                String model = ""; //get from UI
                String make = ""; //get from UI
                int age = 0; //get from UI
                int mpg = 0; //get from UI
                Condition condition = Condition.LIKENEW;
                return AssetManagement.CreateCar(id, value, interest, name, age, model, make, mpg, condition);
            case INVESTMENTACCONT:
                String bank = ""; //get from UI
                return AssetManagement.createInvestmentAccount(id, value, interest, name, bank);
            case PROPERTY:
                int ageProp = 0; //get from UI
                String address = ""; //get from UI
                return AssetManagement.createProperty(id, value, interest, name, ageProp, address);
            case SAVINGSACCOUNT:
                String bankSavings = ""; //get from UI
                return AssetManagement.createSavingsAccount(id, value, interest, name, bankSavings);
        }
        return null;
    }

    public static Liability createLiability(int id, double balance, double interestRate, String name, LiabilityType liabilityType){
        switch (liabilityType){
            case DEFAULT:
                return LiabilityManagement.createLiability(id, balance, interestRate, name);
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