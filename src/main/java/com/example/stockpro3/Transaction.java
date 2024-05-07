package com.example.stockpro3;

public class Transaction {
    private Stock stock;
    private String state;

    public Transaction(Stock stock, String state) {
        this.stock = stock;
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public Stock getStock() {
        return stock;
    }
}
