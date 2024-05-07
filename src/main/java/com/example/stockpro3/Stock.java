package com.example.stockpro3;

import java.util.ArrayList;

public class Stock {
    DataBase dataBase=new DataBase();
    private String label;
    private int price,companyInitialPrice,numOfAvailable,ProfitPercentage;
    private ArrayList<Integer> priceHistory=new ArrayList <>();
    private ArrayList<String> orders=new ArrayList <>();

    public Stock() {
    }

    public Stock(String label, int companyInitialPrice, int numOfAvailable,
                 int ProfitPercentage) {
        this.label = label;
        setCompanyInitialPrice(companyInitialPrice);
        setNumOfAvailable(numOfAvailable);
        this.ProfitPercentage = ProfitPercentage;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getCompanyInitialPrice() {
        return companyInitialPrice;
    }

    public void setCompanyInitialPrice(int companyInitialPrice) {
        while(true) {
            if(companyInitialPrice>0) {
                this.companyInitialPrice = companyInitialPrice;
                this.price=companyInitialPrice;
                break;
            }
            //else

        }
    }

    public int getNumOfAvailable() {
        return numOfAvailable;
    }

    public void setNumOfAvailable(int numOfAvailable) {
        while (true) {
            if (numOfAvailable > 0) {
                this.numOfAvailable = numOfAvailable;
                break;
            }
        }
    }

    public int getProfitPercentage() {
        return ProfitPercentage;
    }

    public void setProfitPercentage(int profitPercentage) {
        this.ProfitPercentage = profitPercentage;
    }

    public ArrayList<Integer> getPriceHistory() {
        return priceHistory;
    }

    public void updatePrice(int price) {
        this.price = price;
        priceHistory.add(price);
    }

    public int getPrice() {
        return price;
    }

}
