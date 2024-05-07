module com.example.stockpro3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stockpro3 to javafx.fxml;
    exports com.example.stockpro3;
}