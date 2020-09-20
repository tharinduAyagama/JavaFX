import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FirstApplication extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("before");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("First App");
        stage.show();
        stage.setHeight(200);
        stage.setWidth(400);
        stage.setX(500);
        stage.setY(300);

        Stage stage1 = new Stage();

        stage1.initModality(Modality.APPLICATION_MODAL);

        stage1.initModality(Modality.WINDOW_MODAL);
        stage1.initOwner(stage);

        stage1.show();

        stage1.initStyle(StageStyle.TRANSPARENT);

    }

    @Override
    public void stop() throws Exception {
        System.out.println("After");
    }
}
