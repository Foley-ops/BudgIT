package com.example.budgit.datamanagement;

import com.example.budgit.expenses.*;

public class ExpenseManagement {
    private ExpenseManagement(){}
    public static Expense createExpense(int id, double cost, int day, int month, String name){
        WriteCache.writeToCache();
        return new Expense(id, cost, day, month, name);
    }
}
