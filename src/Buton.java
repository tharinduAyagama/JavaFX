import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
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

        ToggleButton toggleButton1 = new ToggleButton("yes");
        ToggleButton toggleButton2 = new ToggleButton("no");
        ToggleGroup toggleGroup1 = new ToggleGroup();
        toggleButton1.setToggleGroup(toggleGroup1);
        toggleButton2.setToggleGroup(toggleGroup1);

        RadioButton radioButton1 = new RadioButton("male");
        RadioButton radioButton2 = new RadioButton("female");
        ToggleGroup toggleGroup2 = new ToggleGroup();
        radioButton1.setToggleGroup(toggleGroup2);
        radioButton2.setToggleGroup(toggleGroup2);

        root.getChildren().addAll(b1 , menu , label , toggleButton1 , toggleButton2 , radioButton1 , radioButton2);

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
