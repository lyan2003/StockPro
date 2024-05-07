package com.example.stockpro3;

public class Interactions {
    DataBase dataBase=new DataBase();
    Stock stock=new Stock();
    public Stock searchStock(String label){
        for(Stock stock:dataBase.stocks)
            if (stock.getLabel().equals(label))
                return stock;
        return this.stock;
    }

}
