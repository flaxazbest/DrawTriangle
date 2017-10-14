import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        String fxmlFile = "main.fxml";

        FXMLLoader loader = new FXMLLoader();

        Parent root = (Parent) loader.load(getClass().getResource(fxmlFile));
        primaryStage.setTitle("Draw triangle");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
                primaryStage.show();
    }
}
