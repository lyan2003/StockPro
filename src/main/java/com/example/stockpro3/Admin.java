package com.example.stockpro3;

public class Admin extends Person{
    DataBase dataBase=new DataBase();
    Interactions object=new Interactions();
    public Admin(){
    }

    public Admin(String userName, String password){
        super(userName,password);
    }
    public void addStocks(String label, int companyInitialPrice, int numOfAvailable,
                          int ProfitPercentage){
        Stock stock=new Stock(label,companyInitialPrice,numOfAvailable,ProfitPercentage);
        dataBase.stocks.add(stock);
    }
    public void deleteStocks(String label){
        for(Stock stock:dataBase.stocks)
            if(stock.getLabel().equals(label))
                dataBase.stocks.remove(stock);
    }
    public void userManagement(){

    }
    public void stockManagement(){
    }
    public void stockOrders(){}
    public void price(String label){
        //to be modified
        while(object.searchStock(label) == null) {
            System.out.println("Try again!");
        }
        object.searchStock(label).getPriceHistory();
    }
    public void approvalSystem(){} //user
    public void tradingControl(){}
}