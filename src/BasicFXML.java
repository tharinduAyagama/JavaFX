import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BasicFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent login = FXMLLoader.load(getClass().getResource("Interfaces/login.fxml"));
        Scene loginScene = new Scene(login);
        stage.setTitle("App");
        stage.setScene(loginScene);
        stage.show();
    }
}
