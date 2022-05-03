package com.g1t3.quizapp.quizapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class StartForm extends Application {
    @Override
    public void start(Stage stage){
        BorderPane borderPane = new BorderPane();

        VBox vBox = new VBox(15);

        HBox nameHBox = new HBox(15);
        Label name = new Label("Name");
        TextField textFieldName = new TextField();
        nameHBox.getChildren().addAll(name,textFieldName);

        HBox lastNameHBox = new HBox(15);
        Label lastName = new Label("Nachname");
        TextField textFieldLastName = new TextField();
        lastNameHBox.getChildren().addAll(lastName,textFieldLastName);


        HBox studyHBox = new HBox(15);
        Label study = new Label("Studiengang");
        TextField textFieldStudy = new TextField();
        studyHBox.getChildren().addAll(study,textFieldStudy);

        HBox buttonsHBox = new HBox(15);
        Button startQuizButton = new Button("Test Starten");
        startQuizButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                QuizForm quizForm = new QuizForm(stage);
                quizForm.showView();
            }
        });
        Button endQuizButton = new Button("Exit");
        endQuizButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Platform.exit();
            }
        });
        buttonsHBox.getChildren().addAll(startQuizButton, endQuizButton);

        vBox.getChildren().addAll(nameHBox, lastNameHBox, studyHBox, buttonsHBox);



        borderPane.setCenter(vBox);

        Scene scene = new Scene(borderPane, 500, 200);

        stage.setTitle("Quiz App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}