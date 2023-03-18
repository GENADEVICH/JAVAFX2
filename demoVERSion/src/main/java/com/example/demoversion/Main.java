package com.example.demoversion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50.0);
        circle.setCenterX(100.0);
        circle.setCenterY(100.0);
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(20.0);

        Text text = new Text("АВС");
        text.setX(200.0);
        text.setY(200.0);
        //text.setFill(Color.BROWN) ;
        //Font font = Font.font ("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
        //text.setFont(font);
        //text.setStyle("-fx-fill : red; -fx-font-weight : bold; -fx-font-size : 22");
        text.setStyle("-fx-fill : #8B008B; -fx-font-weight : bold; -fx-font-size :50;" +
                "-fx-fill : linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-tx-font-style : ITALIC");

        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane, 400.0, 400.0);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

