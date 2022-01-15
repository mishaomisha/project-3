package com.company.view;


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

    private TextField login_UsernameField;
    private PasswordField login_PasswordField;
    private TextField nameField;
    private Button enter_login;
    private TextField descriptionField;
    private TextField signIn_UsernameField;
    private PasswordField signIn_PasswordField;
    private Button enter_sighnin;
    private Label password ;


    public TextField getLogin_UsernameField() {
        return login_UsernameField;
    }

    public PasswordField getLogin_PasswordField() {
        return login_PasswordField;
    }

    public TextField getSignIn_UsernameField() {
        return signIn_UsernameField;
    }

    public PasswordField getSignIn_PasswordField() {
        return signIn_PasswordField;
    }

    public Button getEnter_login() {
        return enter_login;
    }

    public Button getEnter_sighnin() {
        return enter_sighnin;
    }

    public TextField getNameField() {
        return nameField;
    }

    public TextField getDescriptionField() {
        return descriptionField;
    }

    public Label getPassword() {
        return password;
    }

    public LoginPage() {

        //Login :

        Image imagefirstpage = new Image("https://cdn.wallpapersafari.com/69/19/iLajcO.jpg");
        Label username = new Label("    Username");
        username.setTextFill(Color.GREEN);
        username.setFont(Font.font("FontPosture.ITALIC", 18));
        username.setAlignment(Pos.CENTER);
        username.setPrefHeight(30);
        login_UsernameField= new TextField();
        Label password = new Label("    password");
        password.setPrefHeight(30);
        password.setAlignment(Pos.CENTER);
        password.setTextFill(Color.BLUE);
        password.setFont(Font.font("FontPosture.ITALIC", 18));
        login_PasswordField = new PasswordField();
        enter_login = new Button("Login");
        enter_login.setPrefHeight(30);
        enter_login.setPrefWidth(240);

        VBox boxlogin = new VBox(username, login_UsernameField, password, login_PasswordField, enter_login);
        boxlogin.setAlignment(Pos.TOP_LEFT);
        boxlogin.setMaxWidth(240);
        boxlogin.setPrefHeight(50);
        boxlogin.setSpacing(20);
        Tab login = new Tab("longin", boxlogin);

        //Sing in :

        Label username2 = new Label("   username");
        username2.setTextFill(Color.GREEN);
        username2.setFont(Font.font("FontPosture.ITALIC", 18));
        username2.setPrefHeight(30);
        username2.setAlignment(Pos.CENTER);
        signIn_UsernameField = new TextField();
        Label password2 = new Label("   password");
        password2.setPrefHeight(30);
        password2.setAlignment(Pos.CENTER);
        password2.setTextFill(Color.BLUE);
        password2.setFont(Font.font("FontPosture.ITALIC", 18));
        signIn_PasswordField= new PasswordField();
        enter_sighnin = new Button("Sign in"); //this
        enter_sighnin.setPrefHeight(30);
        enter_sighnin.setPrefWidth(240);

        //name :
        Label nameLBL = new Label("   name");
        nameField = new TextField();
        nameLBL.setPrefHeight(30);
        nameLBL.setPrefWidth(240);
        nameLBL.setAlignment(Pos.BOTTOM_LEFT);
        nameLBL.setTextFill(Color.ROSYBROWN);
        nameLBL.setFont(Font.font("FontPosture.ITALIC", 22));

        //Description  :
        Label descriptionLBL = new Label("   description ");
        descriptionField = new TextField();
        descriptionLBL.setPrefHeight(30);
        descriptionLBL.setPrefHeight(240);
        descriptionLBL.setAlignment(Pos.BOTTOM_LEFT);
        descriptionLBL.setTextFill(Color.TEAL);
        descriptionLBL.setFont(Font.font("FontPosture.ITALIC", 18));


        VBox boxsighnin = new VBox(username2, signIn_UsernameField, password2, signIn_PasswordField, nameLBL, nameField, descriptionLBL, descriptionField, enter_sighnin);


        boxsighnin.setAlignment(Pos.TOP_LEFT);
        boxsighnin.setMaxWidth(240);
        boxsighnin.setMaxHeight(70);
        boxsighnin.setSpacing(20);
        Tab Sighnin = new Tab("Sign in", boxsighnin);

        this.getTabs().add(login);
        this.getTabs().add(Sighnin);



    }
}

