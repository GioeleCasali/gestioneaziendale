module com.example.gestioneaziendale {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestioneaziendale to javafx.fxml;
    exports com.example.gestioneaziendale;
}