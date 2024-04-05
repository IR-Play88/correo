module es.etg.correo.ejercicio {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.etg.correo.ejercicio to javafx.fxml;
    exports es.etg.correo.ejercicio;
}
