module org.example.lab6_eva {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab6_eva to javafx.fxml;
    exports org.example.lab6_eva;
}