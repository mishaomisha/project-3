package com.company;
import com.company.controller.LoginPageController;
import com.company.model.Channel;
import com.company.model.Grop;
import com.company.model.Person;

import com.company.view.LoginPage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

        public static ArrayList<Person> persons = new ArrayList<>();
        public static Person person;
        public static Person receiverPerson;
        public static Channel currentChannel;
        public static Grop currentGroup;

    public static  void main(String [] args ){

        try {

            FileReader personFile = new FileReader("Person.txt");
            BufferedReader personBuf = new BufferedReader(personFile);

            for( Person i : persons){

                i.setName(personBuf.readLine());
                i.setUserName(personBuf.readLine());
                i.setPassword(personBuf.readLine());
                i.setDescription(personBuf.readLine());

            }


            personBuf.close();


        }catch (IOException ex){
            ex.printStackTrace();
        }

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        LoginPageController loginPageController = new LoginPageController();

        primaryStage.setScene(new Scene(loginPageController.getLoginPage()));
        primaryStage.setHeight(500);
        primaryStage.setWidth(400);

        primaryStage.show();

        /*LoginPage loginPage = new LoginPage();
        primaryStage.setScene(new Scene(loginPage));
        primaryStage.setHeight(800);
        primaryStage.setWidth(400);
        primaryStage.show();*/







    }
}
