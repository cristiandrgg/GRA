import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import screen.DevScreen;

public class JavaFxMainClass extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        Parent root = FXMLLoadeoad(getClass().getResource("fxml/login.fxml"));
        primaryStage.setTitle("GRA - Game Store");
        primaryStage.setScene(new Scene(root, 1600, 1000));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
