module com.example.batalladelmardecoral {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.batalladelmardecoral to javafx.fxml;
    exports com.example.batalladelmardecoral;
}