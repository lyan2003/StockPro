package com.example.stockpro3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Register.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setResizable(false);
        stage.setTitle("TraderApplication");
        stage.setScene(scene);
        stage.show();
    }
    static public void createAdminAccount(String userName ,String password){
        Admin admin = new Admin(userName,password);

    }
    static public void createUserAccount(String userName ,String password){
        User user=new User(userName,password);
    }

    public static void main(String[] args) {launch();
        /*
        String userName ="null";
        String password ="null";
        boolean premium =false;
        launch();

        createAdminAccount(userName , password);
        createUserAccount(userName , password,premium);
*/

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("TO Create account:");
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your password");
        String password = scanner.next();
        Person person = new Person(name, password);
        person.setUserName(name);
        person.setPassword(password);
        System.out.println("Login successfully\n"+"your name is "+ person.getUserName()+"your password is "+person.getPassword());

        System.out.println("choose typePerson:\n"+"1-Admin\n"+"2-User");
        int typePerson =scanner.nextInt();
        switch (typePerson) {
            case 1://Admin
                Admin admin = new Admin(name, password);
                System.out.println("Choose your operation\n"+"1-Add stocks\n"+"2-Delete stocks");
                int operation = scanner.nextInt();
                switch (operation) {
                    case 1:
                      System.out.println("To add stocks enter:\n"+"label:" );
                      String label = scanner.next();
                      System.out.println( "companyInitialPrice:");
                      float companyInitialPrice = scanner.nextFloat();
                      System.out.println("no.OfAvailable:");
                        float noOfAvailable = scanner.nextFloat();
                       System.out.println("%Profit:");
                       float profit = scanner.nextFloat();
                     //  admin.addStocks(label, companyInitialPrice, noOfAvailable, profit);
                       System.out.println( admin.addStocks(label, companyInitialPrice, noOfAvailable, profit).getCompanyInitialPrice());
                    case 2:
                }

            case 2://User






        }

    */

    }
}