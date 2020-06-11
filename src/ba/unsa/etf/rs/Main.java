org.xerial:sqlite-jdbc:3.31.1
mysql:mysql-connector-java:8.0.11
org.json:json:20180813
org.junit.jupiter:junit-jupiter-api:5.6.0
org.testfx:testfx-junit5:4.0.15-alpha


package ba.unsa.etf.rs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


// --module-path /usr/share/openjfx/lib --add-modules javafx.controls,javafx.fxml

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
