package com.example.demoversion;

        import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.layout.GridPane;
        import javafx.scene.layout.StackPane;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.Circle;
        import javafx.scene.shape.Rectangle;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;

public class BorDERPane extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50.0);
        circle.setFill(Color.BLUE);
        Text text = new Text("АВС");
        text.setStyle("-fx-fill : #8B008B; -fx-font-weight : bold; -fx-font-size :20;" +
                "-fx-fill : linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-tx-font-style : ITALIC");
        Rectangle rectangle = new Rectangle(100, 100, 100, 100);

        BorderPane borderPane = new BorderPane();
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle);
        stackPane.getChildren().add(text);

        borderPane.setLeft(stackPane);

        Scene scene = new Scene(borderPane, 400.0, 400.0);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
