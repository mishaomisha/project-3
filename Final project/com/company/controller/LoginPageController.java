package com.company.controller;


import com.company.Main;
import com.company.model.Person;
import com.company.view.LoginPage;
import com.company.view.MainPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.company.Main.person;
import static com.company.Main.persons;

public class LoginPageController extends TabPane {

    private LoginPage loginPage;




    public LoginPageController() {

        loginPage = new LoginPage();
        //methods = new Methods();
        //loginButtonController();
        signInButtonController();
        loginButtonController();


    }

    public void loginButtonController() {

        loginPage.getEnter_login().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                for(Person i : persons){
                    if(loginPage.getLogin_UsernameField().getText().equals(i.getUserName() )
                            && loginPage.getLogin_PasswordField().getText().equals(i.getPassword())){
                        person =i;
                        MainPageController mainPageController =new MainPageController();
                        loginPage.getScene().getWindow().hide();
                        Stage mainStage = new Stage();
                        mainStage.setScene(new Scene(mainPageController.getMainPage()));
                        mainStage.show();
                        break;


                    }else{
                        loginPage.getPassword().setText("Error");
                    }
                }

            }
        });



    }
    public  void signInButtonController(){



        loginPage.getEnter_sighnin().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                person = new Person(loginPage.getSignIn_UsernameField().getText(), loginPage.getSignIn_PasswordField().getText(),
                        loginPage.getNameField().getText(), loginPage.getDescriptionField().getText());

                persons.add(person);

                // Password Hashing :

                String password = person.getPassword();
                String generatedPassword = null ;


                try {

                    MessageDigest md  = MessageDigest.getInstance("MD5");
                    md.update(password.getBytes());

                    byte [] bytes = md.digest();

                    StringBuilder sb = new StringBuilder();
                    for(int i =0; i < bytes.length ; i ++){
                        sb.append(Integer.toString((bytes[i] & 0xff  ) + 0x100 , 16).substring(1));
                    }
                    generatedPassword=sb.toString();


                }catch(NoSuchAlgorithmException ex ){
                    ex.printStackTrace();
                }


                try{

                    FileWriter personFile = new FileWriter("Person.txt");
                    BufferedWriter personBuf = new BufferedWriter(personFile);

                    for( Person i : persons){

                        personBuf.write(i.getName()+"\n");
                        personBuf.write(i.getUserName()+"\n");
                        personBuf.write(generatedPassword+"\n");
                        personBuf.write(i.getDescription()+"\n");

                    }


                    personBuf.close();

                }
                catch (IOException ex){
                    ex.printStackTrace();
                }


                MainPageController mainPageController =new MainPageController();
                loginPage.getScene().getWindow().hide();
                Stage mainStage = new Stage();
                mainStage.setScene(new Scene(mainPageController.getMainPage()));
                mainStage.show();


            }
        });

    }

    public LoginPage getLoginPage() {
        return loginPage;
    }
}
