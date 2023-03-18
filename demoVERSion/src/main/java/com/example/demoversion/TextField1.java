package com.example.demoversion;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

public class TextField1 extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Pane pane = new Pane();
        TextField textField = new TextField();
        Text text = new Text();
        textField.setLayoutX(20);
        textField.setLayoutY(20);
        text.setX(20);
        text.setY(60);
        pane.getChildren().addAll(textField, text);

        textField.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                text.setText(textField.getText());
            }
        });

        Scene scene = new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
