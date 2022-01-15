package com.company.view;



import com.company.Main;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.scene.layout.Pane.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class ProfilePage extends TabPane {

    private TextField nameField;
    private TextField usernameField;
    private PasswordField passwordField;
    private TextField descriptionField;


    private  TextField  nameEditField;
    private  TextField usernameEditField ;
    private  PasswordField passwordEditField ;
    private TextField descriptionEditField;





    public ProfilePage() {

        //Profile

        Image imagefirstpage = new Image("https://cdn.wallpapersafari.com/69/19/iLajcO.jpg");

        Label name = new Label("name");
        name.setTextFill(Color.PINK);
        name.setFont(Font.font("FontPosture.ITALIC", 18));
        name.setAlignment(Pos.CENTER);
        name.setPrefHeight(30);
        nameField= new TextField(Main.person.getName());
        nameField.isDisable();
        HBox nameBox = new HBox(name,nameField);

        Label username = new Label("    Username");
        username.setTextFill(Color.IVORY);
        username.setFont(Font.font("FontPosture.ITALIC", 18));
        username.setAlignment(Pos.CENTER);
        username.setPrefHeight(30);
        usernameField= new TextField(Main.person.getUserName());
        usernameField.isDisable();
        HBox usernameBox = new HBox(username,usernameField);

        Label password = new Label("    password");
        password.setPrefHeight(30);
        password.setAlignment(Pos.CENTER);
        password.setTextFill(Color.BLUE);
        password.setFont(Font.font("FontPosture.ITALIC", 18));
        passwordField = new PasswordField();
        passwordField.setText(Main.person.getPassword());
        passwordField.isDisable();
        passwordField.cancelEdit();
        HBox passwordBox = new HBox(password,passwordField);


        Label description = new Label("description");
        description.setPrefHeight(30);
        description.setAlignment(Pos.CENTER);
        description.setTextFill(Color.BLUE);
        description.setFont(Font.font("FontPosture.ITALIC", 18));
        descriptionField = new TextField(Main.person.getDescription());
        descriptionField.isDisable();
        HBox descriptionBox = new HBox(description,descriptionField);



        VBox vBox = new VBox(nameBox,usernameBox,passwordBox,descriptionBox);

        vBox.setAlignment(Pos.TOP_LEFT);
        vBox.setMaxWidth(240);
        vBox.setPrefHeight(50);
        vBox.setSpacing(20);

        Tab profileTab = new Tab("Profile", vBox);



        //Sing in :

        Label nameEdit = new Label("name");
        nameEdit.setTextFill(Color.PINK);
        nameEdit.setFont(Font.font("FontPosture.ITALIC", 18));
        nameEdit.setAlignment(Pos.CENTER);
        nameEdit.setPrefHeight(30);
        nameEditField = new TextField(Main.person.getName());
        nameEditField.isEditable();


        Label usernameEdit = new Label("    Username");
        usernameEdit.setTextFill(Color.PINK);
        usernameEdit.setFont(Font.font("FontPosture.ITALIC", 18));
        usernameEdit.setAlignment(Pos.CENTER);
        usernameEdit.setPrefHeight(30);
        usernameEditField= new TextField(Main.person.getUserName());
        usernameEditField.isEditable();

        Label passwordEdit = new Label("    password");
        passwordEdit.setPrefHeight(30);
        passwordEdit.setAlignment(Pos.CENTER);
        passwordEdit.setTextFill(Color.BLUE);
        passwordEdit.setFont(Font.font("FontPosture.ITALIC", 18));
        passwordEditField = new PasswordField();
        passwordEditField.setText(Main.person.getPassword());
        passwordField.isEditable();

        Label descriptionEdit = new Label("description");
        descriptionEdit.setPrefHeight(30);
        descriptionEdit.setAlignment(Pos.CENTER);
        descriptionEdit.setTextFill(Color.BLUE);
        descriptionEdit.setFont(Font.font("FontPosture.ITALIC", 18));
        descriptionEditField = new TextField(Main.person.getDescription());
        descriptionEditField.isEditable();




        VBox vBox1 = new VBox(nameEdit,nameEditField,usernameEdit, usernameEditField, passwordEdit, passwordEditField, descriptionEdit,descriptionEditField);

        vBox1.setAlignment(Pos.TOP_LEFT);
        vBox1.setMaxWidth(240);
        vBox1.setPrefHeight(50);
        vBox1.setSpacing(20);

        Tab editProfileTab = new Tab("Sign in", vBox1);


        this.getTabs().add(profileTab);
        this.getTabs().add(editProfileTab);



    }
}


