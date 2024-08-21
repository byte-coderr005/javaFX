package javafx00.javafx01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage)  {

        Group root = new Group();
        Scene scene = new Scene(root,600,600, Color.SKYBLUE); //Açılış ölçüleri ve rengi.
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("merhaba burak");
        text.setX(50);
        text.setY(50);

        text.setFont(Font.font("Verdana",50)); //Font ayarla
        text.setFill(Color.LIMEGREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);

        root.getChildren().add(text); // texti ekledik.
        // primaryStage kullanarak sahneyi belirtiyoruz
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");

        // Sahneyi görünür hale getiriyoruz
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
