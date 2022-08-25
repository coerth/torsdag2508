module com.example.torsdag2508 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.zaxxer.hikari;


    opens com.example.torsdag2508 to javafx.fxml;
    exports com.example.torsdag2508;
}