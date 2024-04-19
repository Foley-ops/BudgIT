package com.example.budgit.datamanagement;

import com.example.budgit.liabilities.*;
import com.example.budgit.datamanagement.WriteCache;
public class LiabilityManagement {
    private LiabilityManagement(){}

    public static Liability createLiability(int id, double balance, double interestRate, String name){
        WriteCache.writeToCache();
        return new Liability(id, balance, interestRate, name);
    }

    public static Mortgage createMortgage(int id, double balance, double interestRate, String name, int term){
        WriteCache.writeToCache();
        return new Mortgage(id, balance, interestRate, name, term);
    }

    public static CarNote createCarNote(int id, double balance, double interestRate, String name, int term){
        WriteCache.writeToCache();
        return new CarNote(id, balance, interestRate, name, term);
    }

    public static PersonalLoan createPersonalLoan(int id, double balance, double interestRate, String name, int age, String reason){
        WriteCache.writeToCache();
        return new PersonalLoan(id, balance, interestRate, name, age, reason);
    }

    public static CreditCard createCreditCard(int id, double balance, double interestRate, String name, int age){
        WriteCache.writeToCache();
        return new CreditCard(id, balance, interestRate, name, age);
    }

    public static StudentLoan createStudentLoan(int id, double balance, double interestRate, String name, String degree, int age, boolean federal, boolean subsidized){
        WriteCache.writeToCache();
        return new StudentLoan(id, balance, interestRate, name, degree, age, federal, subsidized);
    }
}
