package com.example.demoversion;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;

public class FadeTRansition extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Image image = new Image(new FileInputStream("src/flag.jpg"));
        ImageView imageView = new ImageView(image);
        pane.getChildren().add(imageView);


        FadeTransition ft = new FadeTransition(Duration.millis(3000), imageView);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(6);
        ft.setAutoReverse(true);
        ft.play();

        Scene scene = new Scene(pane, 400.0, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}