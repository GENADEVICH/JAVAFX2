package com.example.demoversion;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class ScroLLBAR extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        BorderPane borderPane = new BorderPane();
        ScrollBar scrollBarV = new ScrollBar();
        scrollBarV.setOrientation(Orientation. VERTICAL);
        ScrollBar scrollBarH = new ScrollBar();

        Pane pane = new Pane();

        Text text = new Text("Olympic Games");
        text.setX(0);
        text.setY(0);
        pane.getChildren().add(text);

        borderPane.setCenter(pane);
        borderPane.setBottom(scrollBarH);
        borderPane.setRight(scrollBarV);

        text.xProperty().bind(scrollBarH.valueProperty());
        text.yProperty().bind(scrollBarV.valueProperty());


        Scene scene = new Scene(borderPane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
