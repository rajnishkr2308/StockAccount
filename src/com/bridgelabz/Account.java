package com.bridgelabz;

public class Account {
    // instance variable that stores the account balance
    private double accountBalance;

    //Constructor
    public Account(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public double getAccountBalance() {
        // gives the value of account balance to the calling method
        return accountBalance;
    }
    public void creditAmount (double creditAmount) {
        // credit or add amount to the account
        accountBalance += creditAmount;
    }
    public void debitAmount(double debitAmount) {

        if (debitAmount > accountBalance){
            System.out.println("Debit amount exceeded account balance.");
        }else{
            // debit or deduct the amount from the account
            accountBalance -= debitAmount;
        }
    }
}
