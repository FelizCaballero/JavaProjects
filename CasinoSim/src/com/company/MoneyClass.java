package com.company;

public class MoneyClass {
    private int winnings;
    private int losses;
    private int balance;

    public MoneyClass(int Number){
        balance = Number;
    }

    public int deduction(){
    losses = 10;
    return losses;
    }

    public int accrual(){
        winnings = 20;
        return winnings;
    }
}
