package original;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import original.view.LoginPage;

public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        LoginPage LoginPage = new LoginPage();
        primaryStage.setScene(new Scene(LoginPage));
        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.show();
    }
}






