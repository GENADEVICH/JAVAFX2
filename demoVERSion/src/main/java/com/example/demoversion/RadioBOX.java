package com.example.demoversion;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

public class RadioBOX extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        Pane pane = new Pane();
        RadioButton r1 = new RadioButton("yes");
        RadioButton r2 = new RadioButton("no");
        Text text = new Text();

        pane.getChildren().addAll(r1, r2,text);

        r1.setLayoutX(20);
        r1.setLayoutY(20);
        r2.setLayoutX(20);
        r2.setLayoutY(40);
        text.setX(20);
        text.setY(80);

        ToggleGroup group = new ToggleGroup();
        r1.setToggleGroup(group);
        r2.setToggleGroup(group);

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(r1.isSelected())
                    text.setText("Yes is selected");
                else if(r2.isSelected())
                    text.setText("No is selected");
                else text.setText("Nothing is selected");
            }
        };

        r1.setOnAction(handler);
        r2.setOnAction(handler);
        Scene scene = new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

