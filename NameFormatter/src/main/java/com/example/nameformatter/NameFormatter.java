package com.example.nameformatter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NameFormatter extends Application{

    @Override
    public void start(Stage stage){
        Label promptLabel = new Label("Enter Your Name and click a button to format it.");
        Label FNameLabel = new Label("First name: ");
        Label MNameLabel = new Label("Middle name: ");
        Label LNameLabel = new Label("Last name: ");
        Label TitleLabel = new Label("Title: ");

        TextField FirstNameTextField = new TextField();
        TextField MiddleNameTextField = new TextField();
        TextField LastNameTextField = new TextField();
        TextField TitleTextField = new TextField();

        Button tfmlButton = new Button("First Format");
        Button fmlButton = new Button("Second Format");
        Button flButton = new Button("Third Format");
        Button lfmtButton = new Button("Fourth Format");
        Button lfmButton = new Button("Fifth Format");
        Button lfButton = new Button("Sixth Format");

        tfmlButton.setOnAction(new NameFormatterController());
        fmlButton.setOnAction(new NameFormatterController());
        flButton.setOnAction(new NameFormatterController());
        lfmtButton.setOnAction(new NameFormatterController());
        lfmButton.setOnAction(new NameFormatterController());
        lfButton.setOnAction(new NameFormatterController());

        Label outputLabel = new Label();

        HBox hbox = new HBox(10, promptLabel, FNameLabel, MNameLabel, LNameLabel, TitleLabel, FirstNameTextField, MiddleNameTextField, LastNameTextField, TitleTextField);
        VBox vbox = new VBox(10, hbox, tfmlButton, fmlButton, flButton, lfmtButton, lfmButton, lfButton, outputLabel);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));

        Scene scene = new Scene(vbox);

        stage.setTitle("Name Formatter");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    static class NameFormatterController implements EventHandler {

        private Button tfmlButton;
        private Button fmlButton;
        private Button flButton;
        private Button lfmtButton;
        private Button lfmButton;
        private Button lfButton;
        private Label outputLabel;
        private TextField firstName;
        private TextField middleName;
        private TextField lastName;
        private TextField title;


        public void initialize(){}

        public void tfml(ActionEvent event)
        {
            outputLabel.setText(title.getText() + " " +
                    firstName.getText() + " " +
                    middleName.getText() + " " +
                    lastName.getText());
        }

        public void fml()
        {
            outputLabel.setText(firstName.getText() + " " +
                    middleName.getText() + " " +
                    lastName.getText());
        }

        public void fl()
        {
            outputLabel.setText(firstName.getText() + " " +
                    lastName.getText());
        }

        public void lfmt()
        {
            outputLabel.setText(lastName.getText() + ", " +
                    firstName.getText() + " " +
                    middleName.getText() + ", " +
                    title.getText());
        }

        public void lfm()
        {
            outputLabel.setText(lastName.getText() + ", " +
                    firstName.getText() + " " +
                    middleName.getText());
        }

        public void lf()
        {
            outputLabel.setText(lastName.getText() + ", " +
                    firstName.getText());
        }

        public void handle() {

        }

        @Override
        public void handle(Event event) {

        }
    }
}