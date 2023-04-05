module com.example.phone2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.phone2 to javafx.fxml;
    exports com.example.phone2;
}