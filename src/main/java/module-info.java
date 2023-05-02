module com.example.demohello {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.demohello to javafx.fxml;
    exports com.example.demohello;
}