import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HyperLink extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("HyperLink");
        stage.setHeight(300);
        stage.setWidth(400);
        stage.setX(500);
        stage.setY(300);

        VBox root = new VBox();
        Hyperlink link = new Hyperlink("click me");
        link.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("clicked");
            }
        });
        root.getChildren().addAll(link);

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
