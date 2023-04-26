package com.bridgelabz;
import java.util.Scanner;

    /*
    Modify class Account to provide a method called debit that withdraws money from an Account. Ensure that the
    debit amount does not exceed the Account’s balance. If it does, the balance should be left unchanged
    and the method should print a message indicating ―Debit amount exceeded account balance.
    Modify class AccountTest to test method debit.
     */
    public class AccountTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //Initial Account Balance Using Scanner
            System.out.println("Enter the initial Account Balance : ");
            double accountBalance = scanner.nextDouble();
            ////call method to Credit Amount
            Account account = new Account(accountBalance);
            System.out.println("Enter the credit Amount : ");
            double creditAmount = scanner.nextDouble();
            account.creditAmount(creditAmount);
            System.out.println("The Account Balance is Rs." +account.getAccountBalance());
            //call method to Debit Amount
            System.out.println("Enter the Debit Amount : ");
            double debitAmount = scanner.nextDouble();
            account.debitAmount(debitAmount);
            System.out.println("The Account Balance is Rs." +account.getAccountBalance());
        }
    }

