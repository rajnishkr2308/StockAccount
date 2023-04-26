package com.bridgelabz;

public class Stock {
    //Instance Variables
    private String name;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice) {
        //Parameterised Constructor
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }
    //Generating Getter and Setter
    public String getName() {
        return name;
    }
    public int getNumberOfShares() {
        return numberOfShares;
    }
    public double getSharePrice() {
        return sharePrice;
    }
    public double getValue() {
        return numberOfShares * sharePrice;
    }

    @Override
    public String toString() {
        return ("name: " + name + "; Number of Shares: "+ numberOfShares + "; Share price@ $" + sharePrice + " => $" +getValue());
    }
}

