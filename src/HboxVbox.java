import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HboxVbox extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CssStyling");
        stage.setHeight(300);
        stage.setWidth(400);
        stage.setX(500);
        stage.setY(300);

        HBox root = new HBox();
        Button b1 = new Button("A");
        Button b2 = new Button("B");
        Button b3 = new Button("C");
        Button b4 = new Button("D");

        root.setSpacing(10);
        root.setAlignment(Pos.BASELINE_CENTER);

        root.getChildren().addAll(b1 , b2 , b3 , b4);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
