module com.redspark.archeageunchained {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.redspark.archeageunchained to javafx.fxml;
    exports com.redspark.archeageunchained.login;
}