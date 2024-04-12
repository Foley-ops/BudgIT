package com.example.budgit.assets;

public class SavingsAccount extends Asset{
    private String Bank;

    public SavingsAccount(int id, double value, double interest, String name, String bank) {
        super(id, value, interest, name);
        this.Bank = bank;
    }

    public SavingsAccount(String bank) {
        this.Bank = bank;
    }

    public SavingsAccount(){}

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }
}
