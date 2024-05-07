package com.example.stockpro3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class controllerUser implements Initializable {
    @FXML
    private Label options;
    @FXML
    private ChoiceBox<String> choiceBox;
    private String[] optionsType = {"Buy stocks","Sell stocks" , "Get stocks " , "History" ,
            "Financial operations " ,
            "Premium features " ,
            "Market performance " ,
            "Charting options " ,
            "Export functionality " ,
            "Get transactions"};

    public void initialize(URL url, ResourceBundle rb) {
        choiceBox.getItems().addAll(optionsType);
        choiceBox.setOnAction(this::getOptionsType);
    }
    public void getOptionsType(ActionEvent event) {
        String myOption = choiceBox.getValue();
        options.setText(myOption);
    }

}