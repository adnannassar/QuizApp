package com.g1t3.quizapp.quizapp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class QuizForm extends Stage {

    public QuizForm(Stage parent) {
        this.initOwner(parent);
        this.initModality(Modality.WINDOW_MODAL);
    }

    public void showView() {

        VBox vBox = new VBox(15);

        HBox questionHBox = new HBox();
        Label question = new Label("Question 1");
        questionHBox.getChildren().add(question);

        HBox answerHBox1 = new HBox();
        Label answer1 = new Label("Answer1");
        CheckBox answer1CheckBox = new CheckBox();
        answerHBox1.getChildren().addAll(answer1, answer1CheckBox);


        HBox answerHBox2 = new HBox();
        Label answer2 = new Label("Answer1");
        CheckBox answer2CheckBox = new CheckBox();
        answerHBox2.getChildren().addAll(answer2, answer2CheckBox);


        HBox answerHBox3 = new HBox();
        Label answer3 = new Label("Answer1");
        CheckBox answer3CheckBox = new CheckBox();
        answerHBox3.getChildren().addAll(answer3, answer3CheckBox);

        Button nextQuestion = new Button("Nächste Frage");
        vBox.getChildren().addAll(questionHBox, answerHBox1, answerHBox2, answerHBox3, nextQuestion);

        Pane pane = new Pane();

        pane.getChildren().add(vBox);

        Scene scene = new Scene(pane, 500, 300);

        this.setTitle("Test");
        this.setScene(scene);
        this.show();
    }
}
