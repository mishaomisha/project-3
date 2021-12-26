package original.view;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.application.Application;

public class LoginPage extends TabPane {
    private TextField entered_Username;
    private PasswordField entered_password;
    private Button enter_login;

    public LoginPage() {
        Label username = new Label("Username");
        entered_Username = new TextField();
        Label password = new Label("Username");
        entered_password = new PasswordField();
        enter_login = new Button("login");
        VBox boxlogin = new VBox(username, entered_Username, password, entered_password, enter_login);

        Tab Sighnin = new Tab("Sighn in", boxlogin);

        Label username2 = new Label("username");
        entered_Username = new TextField();
        Label password2 = new Label("Username");
        entered_password = new PasswordField();
        enter_login = new Button("login");
        VBox boxsighnin = new VBox(username, entered_Username, password, entered_password, enter_login);

        Tab Login = new Tab("Login", boxsighnin);
        this.getChildren().addAll(boxlogin,boxsighnin);
    }
}

