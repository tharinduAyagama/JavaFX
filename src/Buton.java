import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Buton extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CssStyling");
        stage.setHeight(300);
        stage.setWidth(400);
        stage.setX(500);
        stage.setY(300);

        VBox root = new VBox();

        Button b1 = new Button("_click me");
        b1.setStyle("" +
                "-fx-background-color: black;" +
                "-fx-font-size: 16px;" +
                "-fx-border-radius: 70;");
        b1.setMnemonicParsing(true);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("pressedc");
            }
        });
        root.getChildren().add(b1);

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
