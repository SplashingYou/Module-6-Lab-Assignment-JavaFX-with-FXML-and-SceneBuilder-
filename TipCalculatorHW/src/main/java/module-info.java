module com.example.tipcalculatorhw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tipcalculatorhw to javafx.fxml;
    exports com.example.tipcalculatorhw;
}