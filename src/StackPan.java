import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPan extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Stackpane");
        stage.setHeight(300);
        stage.setWidth(400);
        stage.setX(500);
        stage.setY(300);

        ImageView imageView = new ImageView("https://www.humanrightslogo.net/sites/default/files/styles/download_preview/public/images/preview/walls.jpg?itok=hN8PUQE0");
        Button b1 = new Button("click");

        StackPane root = new StackPane(imageView , b1);

        root.setStyle("" +
                "-fx-background-color: aqua");

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
