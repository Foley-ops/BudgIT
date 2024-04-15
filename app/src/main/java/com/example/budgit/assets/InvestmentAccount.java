package com.example.budgit.assets;

import java.util.ArrayList;

public class InvestmentAccount extends Asset {
    private String brokerage;
    private ArrayList<Security> portfolio;

    public InvestmentAccount(String brokerage) {
        this.brokerage = brokerage;
        this.portfolio = new ArrayList<Security>();
    }

    public InvestmentAccount(){
        this.portfolio = new ArrayList<Security>();
    }
}