module com.example.olamundojfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.olamundojfx to javafx.fxml;
    exports com.example.olamundojfx;
}