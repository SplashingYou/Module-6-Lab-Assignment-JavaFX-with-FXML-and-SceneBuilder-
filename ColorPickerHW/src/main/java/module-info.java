module com.example.colorpickerhw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.colorpickerhw to javafx.fxml;
    exports com.example.colorpickerhw;
}