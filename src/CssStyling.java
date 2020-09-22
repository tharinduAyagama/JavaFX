import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CssStyling extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CssStyling");
        stage.setHeight(300);
        stage.setWidth(400);
        stage.setX(500);
        stage.setY(300);

        VBox root = new VBox();
        Label label = new Label("this ia the label");
        label.setId("specialLabel");
        Hyperlink link = new Hyperlink("Click me");
        link.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                link.setText("im colored");
                link.setStyle("-fx-background-color: brown;-fx-padding: 10px");
            }
        });
        HBox container = new HBox(link , label);
        root.getChildren().addAll(container);
        Scene scene = new Scene(root);

        scene.getStylesheets().add("Stylesheets/styles.css");
        stage.setScene(scene);
        stage.show();
    }
}
