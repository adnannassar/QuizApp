module com.g1t3.quizapp.quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.g1t3.quizapp.quizapp to javafx.fxml;
    exports com.g1t3.quizapp.quizapp;
}