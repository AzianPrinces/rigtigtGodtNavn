module dk.easv.de {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.de to javafx.fxml;
    exports dk.easv.de;
}