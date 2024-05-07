package com.example.stockpro3;

import java.util.ArrayList;
public class DataBase {
    static ArrayList<User> users=new ArrayList <>();
    static ArrayList<Stock> stocks=new ArrayList <>();
    ArrayList<ArrayList<Transaction>> allTransactions = new ArrayList<>();
    static ArrayList<Transaction> transactionHistory=new ArrayList<>();
    static ArrayList<Transaction> transactions =new ArrayList <>();
    static ArrayList<Stock> userStocks=new ArrayList <>();
    Admin admin=new Admin();
    int numOfAdmins=0;
}
