package com.example.stockpro3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class User extends Person {
    // protected String email;
    // DataBase dataBase=new DataBase();
    private boolean premium=false;
    private float wallet;
    private ArrayList<Stock> userStocks=new ArrayList <>();
    private ArrayList<Transaction> transactions =new ArrayList <>();

    public User(){
    }
    public User(String userName, String password){

        super(userName,password);
        this.wallet = 0;

    }

   // public User(String userName, String password, boolean premium) {
    //}


    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public void setWallet(float wallet) {
        this.wallet = wallet;
    }
    public float getWallet() {
        return wallet;
    }
    public boolean isPremium() {
        return premium;
    }
    public void upgradeToPremium() {
        this.premium = true;
    }
    public void buyStocks(String label){
        for(Stock stock:DataBase.stocks)
            if(stock.getLabel().equals(label)) {
                while(true) {
                    if (wallet > stock.getPrice())
                        break;
                    //else
                    //scene
                }
                wallet-=stock.getPrice();
                userStocks.add(stock);
                if(stock.getNumOfAvailable()==1)
                    DataBase.stocks.remove(stock);
                else
                    stock.setNumOfAvailable(stock.getNumOfAvailable()-1);
                Transaction transaction=new Transaction(stock,"bought");
                transactions.add(transaction);
            }
    }

    public void sellStocks(String label){
        for(Stock stock:DataBase.stocks)
            if(stock.getLabel().equals(label)) {
                wallet+=stock.getPrice();
                userStocks.remove(stock);
                if(stock.getNumOfAvailable()==1)
                    DataBase.stocks.add(stock);
                else
                    stock.setNumOfAvailable(stock.getNumOfAvailable()+1);
                Transaction transaction=new Transaction(stock,"sold");
                transactions.add(transaction);
            }
    }
    public ArrayList<Stock> getUserStocks() {
        return userStocks;
    }

    public void financialHistory(){
        System.out.println("+"+wallet);
        for(Transaction transaction:transactions) {
            if (transaction.getState().equals("bought"))
                System.out.print("-");
            else
                System.out.print("+");
            System.out.println(transaction.getStock().getPrice());
        }
    }
    public void financialOperation(){
        for (User user : DataBase.users)
            if (user.getUserName().equals(userName)) {
                for (Transaction transaction :DataBase.transactionHistory) {
                    System.out.println(transaction);
                }
            }
    }//waiting list
    public void transactionHistory(){
        for(Transaction transaction:transactions) {
            System.out.println(transaction.getStock().getLabel());
            System.out.println(transaction.getState());
        }} //stock
    public void priceHistory(){} //stock
    public void premiumFeatures(){} //if(premium==true)
    public void marketPerformance(){}
    public void chartingOptions(Stock stock){
        float openingPrice, closingPrice, maximumPrice, minimumPrice,profitOrLoss;
        openingPrice=stock.getCompanyInitialPrice();
        closingPrice=stock.getPrice();
        maximumPrice=Collections.max(stock.getPriceHistory());
        minimumPrice=Collections.min(stock.getPriceHistory());
        profitOrLoss= stock.getProfitPercentage();
    }  //stock //need to be charts
    public void exportFunctionality(){}  //stock

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField Username;
    @FXML
    private PasswordField Password;
    @FXML
    private Label errorLoginMessage;

    public void SignAsUser(ActionEvent event) throws IOException {//on click login admin

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignAsUser.fxml"));
        root = loader.load();
        userName = Username.getText();
        password = Password.getText();


        if(userName.isEmpty()||password.isEmpty()){
            errorLoginMessage.setText("Please enter both your user and password");
            return;}

        if(!(userName.isEmpty() & password.isEmpty()))
        {root = FXMLLoader.load(getClass().getResource("controllerUser.fxml"));
        }

        setUserName(userName);
        setPassword(password);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}