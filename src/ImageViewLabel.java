import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ImageViewLabel extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ImageViewLabel");
        stage.setHeight(300);
        stage.setWidth(400);
        stage.setX(500);
        stage.setY(300);

        VBox root = new VBox();
        Scene scene = new Scene(root);
        Label label1 = new Label("this is labal1");
        label1.setTextFill(Color.web("#0398fc"));
        ImageView image = new ImageView("https://icons.iconarchive.com/icons/iconfactory/star-wars-1/32/AT-AT-icon.png");
        root.getChildren().addAll(image , label1);

        stage.setScene(scene);
        stage.show();
    }
}
