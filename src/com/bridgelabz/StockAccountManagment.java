package com.bridgelabz;
import java.util.Scanner;

public class StockAccountManagment {
    public static void main(String[] args) {
        System.out.println("Welcome to Stock Account Managment");
        //Scanner method to read Stock Names, Number of Share, Share Price.
                Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Stocks : ");
        int numberOfStocks = scanner.nextInt();
        //for loop,the number of stocks
        StockPortfolio stockPortfolio = new StockPortfolio();
        for (int i = 0; i<numberOfStocks; i++){
            System.out.println("Enter the Details of Stocks " + (1+i) + " :");
            System.out.println("Enter the Share Name : ");
            String shareName = scanner.next();
            System.out.println("Enter the Number of Shares : ");
            int shareNumber = scanner.nextInt();
            System.out.println("Enter the Share Price : ");
            double sharePrice = scanner.nextDouble();
            //Call method
            Stock stock = new Stock(shareName,shareNumber,sharePrice);
            stockPortfolio.addStock(stock);
        }
        //To print Total Stock Value
        stockPortfolio.printReport();
    }
}
