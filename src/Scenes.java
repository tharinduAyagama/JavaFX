import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Scenes extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Scene");
        stage.setHeight(300);
        stage.setWidth(400);
        stage.setX(500);
        stage.setY(300);

        VBox parent = new VBox();
        Label label1 = new Label("this is a lable1");
        Label label2 = new Label("this is a lable2");
        parent.getChildren().addAll(label1 , label2);

        Scene scene = new Scene(parent);


        stage.setScene(scene);
        stage.show();
    }
}
