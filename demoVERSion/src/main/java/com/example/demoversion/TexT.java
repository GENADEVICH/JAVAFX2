package com.example.demoversion;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TexT extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Text text = new Text("List is beautifull");
        text.setX(200);
        text.setY(200);
        text.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                text.setX(mouseEvent.getX());
                text.setY(mouseEvent.getY());
            }
        });

        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 400.0, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
