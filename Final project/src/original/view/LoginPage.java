package original.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.scene.layout.Pane.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class LoginPage extends TabPane {
    private TextField entered_Username;
    private PasswordField entered_password;
    private Button enter_login;
    private Button enter_sighnin;

    public LoginPage() {
        Image imagefirstpage = new Image("https://cdn.wallpapersafari.com/69/19/iLajcO.jpg");
        Label username = new Label("    Username");
        username.setTextFill(Color.GREEN);
        username.setFont(Font.font ("FontPosture.ITALIC", 18));
        username.setAlignment(Pos.CENTER);
        username.setPrefHeight(30);
        entered_Username = new TextField();
        Label password = new Label("    password");
        password.setPrefHeight(30);
        password.setAlignment(Pos.CENTER);
        password.setTextFill(Color.BLUE);
        password.setFont(Font.font ("FontPosture.ITALIC", 18));
        entered_password = new PasswordField();
        enter_login = new Button("login");
        enter_login.setPrefHeight(30);
        enter_login.setPrefWidth(240);
        VBox boxlogin = new VBox(username, entered_Username, password, entered_password, enter_login);
        boxlogin.setAlignment(Pos.TOP_LEFT);
        boxlogin.setMaxWidth(240);
        boxlogin.setPrefHeight(50);
        boxlogin.setSpacing(20);
        Tab login = new Tab("longin", boxlogin);

        Label username2 = new Label("username");
        username2.setTextFill(Color.GREEN);
        username2.setFont(Font.font ("FontPosture.ITALIC", 18));
        username2.setPrefHeight(30);
        username2.setAlignment(Pos.CENTER);
        entered_Username = new TextField();
        Label password2 = new Label("password");
        password2.setPrefHeight(30);
        password2.setAlignment(Pos.CENTER);
        password2.setTextFill(Color.BLUE);
        password2.setFont(Font.font ("FontPosture.ITALIC", 18));
        entered_password = new PasswordField();
        enter_sighnin = new Button("sighn in");
        enter_sighnin.setPrefHeight(30);
        enter_sighnin.setPrefWidth(240);
        VBox boxsighnin = new VBox(username2, entered_Username, password2, entered_password, enter_sighnin);
        boxsighnin.setAlignment(Pos.TOP_LEFT);
        boxsighnin.setMaxWidth(240);
        boxsighnin.setMaxHeight(50);
        boxsighnin.setSpacing(20);
        Tab Sighnin = new Tab("Sighn in", boxsighnin);

        this.getTabs().add(login);
        this.getTabs().add(Sighnin);

    }
}
