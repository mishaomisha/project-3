package original.view;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.scene.layout.Pane.*;


public class LoginPage extends TabPane {
    private TextField entered_Username;
    private PasswordField entered_password;
    private Button enter_login;
    private Button enter_sighnin;

    public LoginPage() {
        Label username = new Label("Username");
        username.setAlignment(Pos.CENTER);
        username.setPrefHeight(50);
        entered_Username = new TextField();
        Label password = new Label("password");
        password.setPrefHeight(50);
        entered_password = new PasswordField();
        enter_login = new Button("login");
        VBox boxlogin = new VBox(username, entered_Username, password, entered_password, enter_login);
        boxlogin.setAlignment(Pos.TOP_LEFT);
        boxlogin.setPrefWidth(240);
        boxlogin.setPrefHeight(50);
        Tab login = new Tab("longin", boxlogin);

        Label username2 = new Label("username");
        username2.setPrefHeight(50);
        username.setAlignment(Pos.CENTER);
        entered_Username = new TextField();
        Label password2 = new Label("password");
        password2.setPrefHeight(50);
        entered_password = new PasswordField();
        enter_sighnin = new Button("sighn in");
        VBox boxsighnin = new VBox(username2, entered_Username, password2, entered_password, enter_sighnin);
        boxsighnin.setAlignment(Pos.TOP_LEFT);
        boxsighnin.setPrefWidth(240);
        boxsighnin.setPrefHeight(50);
        Tab Sighnin = new Tab("Sighn in", boxsighnin);

        this.getTabs().add(login);
        this.getTabs().add(Sighnin);

    }
}
