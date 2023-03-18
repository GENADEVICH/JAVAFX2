package com.example.demoversion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class ColorFx extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Pane pane = new Pane();
        Text text = new Text("ABCDEFGH");
        Color color = new Color (1.0, 0.5, 1, 0.2);
        text.setFill(color);
        text.setX(200);
        text.setY (200);
        pane.getChildren().add (text);
        // RGB - red, green, blue, opaque
        // 200, 50, 50
        // 0.0 till 1.0

        Scene scene = new Scene(pane, 400.0, 400.0);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
