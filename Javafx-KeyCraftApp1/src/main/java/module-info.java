module com.example.KeyCraftApp {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires  org.xerial.sqlitejdbc;

    opens com.example.KeyCraftApp to javafx.fxml;
    exports com.example.KeyCraftApp;
    exports com.example.KeyCraftApp.Controller;
    exports com.example.KeyCraftApp.Database;
    exports com.example.KeyCraftApp.Model;
}