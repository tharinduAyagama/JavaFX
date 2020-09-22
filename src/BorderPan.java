import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPan extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CssStyling");
        stage.setHeight(300);
        stage.setWidth(400);
        stage.setX(500);
        stage.setY(300);

        Button b1 = new Button("A");
        Button b2 = new Button("B");
        Button b3 = new Button("C");
        Button b4 = new Button("D");
        Button b5 = new Button("E");
        BorderPane root = new BorderPane();
        root.setCenter(b1);
        root.setLeft(b2);
        root.setRight(b3);
        root.setBottom(b4);
        root.setTop(b5);
        BorderPane.setAlignment(b2 , Pos.CENTER_LEFT);
        BorderPane.setAlignment(b3 , Pos.CENTER_RIGHT);
        BorderPane.setAlignment(b4 , Pos.BOTTOM_CENTER);
        BorderPane.setAlignment(b5 , Pos.TOP_CENTER);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
