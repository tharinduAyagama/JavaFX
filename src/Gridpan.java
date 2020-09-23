import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gridpan extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Stackpane");
//        stage.setHeight(300);
//        stage.setWidth(400);
        stage.setX(500);
        stage.setY(300);

        Label usernameLabel = new Label("Username: ");
        Label emailLabel = new Label("Email: ");
        Label passwordLabel = new Label("Password: ");

        TextField usernameFeild = new TextField();
        TextField emailFeild = new TextField();
        PasswordField passwordField = new PasswordField();

        GridPane gridPane = new GridPane();
        gridPane.add(usernameLabel , 0 ,0);
        gridPane.add(emailLabel , 0 , 1);
        gridPane.add(passwordLabel , 0 ,2);
        gridPane.add(usernameFeild , 1,0);
        gridPane.add(emailFeild,1,1);
        gridPane.add(passwordField , 1,2);

        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(30));

        gridPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }
}
