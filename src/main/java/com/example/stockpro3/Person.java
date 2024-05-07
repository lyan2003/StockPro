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

public class Person {
    protected String userName;
    protected String password;

    public Person() {
    }

    public Person(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    //set condition if(numOfAdmins==0) on this method in UI


    Stage stage;
    private Scene scene;
    private Parent root;

    public void clickOnAdmin(ActionEvent event) throws IOException {


        root = FXMLLoader.load(getClass().getResource("SignAsAdmin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
    public void clickOnUser(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SignAsUser.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
