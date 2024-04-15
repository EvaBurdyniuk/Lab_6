package org.example.lab6_eva;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        Polygon triangle = new Polygon();

        triangle.getPoints().addAll(100.0, 0.0, 0.0, 200.0, 200.0, 200.0);
        triangle.setFill(Color.TRANSPARENT);
        triangle.setStroke(Color.BLACK);

        Button blackButton = new Button("Залити чорним");
        blackButton.setOnAction(e -> triangle.setFill(Color.BLACK));

        Button redButton = new Button("Залити червоним");
        redButton.setOnAction(e -> triangle.setFill(Color.RED));

        Button cancelButton = new Button("Скасувати");
        cancelButton.setOnAction(e -> triangle.setFill(Color.TRANSPARENT));

        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(blackButton, redButton, cancelButton);

        StackPane root = new StackPane();
        root.getChildren().addAll(triangle, buttonBox);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Малювання та кнопки");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
