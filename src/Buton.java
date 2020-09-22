import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
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

        Label label = new Label("nothing selected");

        MenuItem item1 = new MenuItem("apple");
        item1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label.setText("apple");
            }
        });

        MenuItem item2 = new MenuItem("orange");
        item2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label.setText("orange");
            }
        });

        MenuItem item3 = new MenuItem("grapes");
        item3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label.setText("grapes");
            }
        });

        MenuItem item4 = new MenuItem("melon");
        item4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label.setText("melon");
            }
        });

        MenuButton menu = new MenuButton("fruits" , null , item1 , item2 , item3 , item4);

        root.getChildren().addAll(b1 , menu , label);

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
