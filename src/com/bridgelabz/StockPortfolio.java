package com.bridgelabz;
import java.util.ArrayList;

public class StockPortfolio {
        //List of Stocks
        ArrayList<Stock> stockDetails = new ArrayList<>();

        public void addStock(Stock stock) {
            //Adding stocks
            stockDetails.add(stock);
        }
        public double getTotalValue() {
            //Total value of stocks
            double totalValue = 0;
            for (Stock stock : stockDetails) {
                totalValue += stock.getValue();
            }
            return totalValue;
        }
        public void printReport() {
            for (Stock stock : stockDetails) {
                System.out.println(stock.toString());
            }
            System.out.println("Total Stock value: " + getTotalValue()+ " $");
        }
    }

