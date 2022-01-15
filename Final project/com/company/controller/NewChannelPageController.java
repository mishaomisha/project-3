package com.company.controller;


import com.company.Main;
import com.company.model.Person;
import  com.company.model.Channel;
import com.company.view.MainPage;
import com.company.view.NewChannelPage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollToEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static com.company.Main.person;
import static com.company.Main.persons;


public class NewChannelPageController {

    NewChannelPage newChannelPage ;
    MainPageController mainPageController ;
    ArrayList<Person> memberList;

    //WriteOnFile writeOnFile = new WriteOnFile();



    public NewChannelPageController(MainPageController mainPageController) {

        newChannelPage = new NewChannelPage();
        this.mainPageController = mainPageController;
        memberList = new ArrayList<>();


        addButtonController();
        doneButtonController();


    }


    public void addButtonController(){

        newChannelPage.getAddBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                String username =newChannelPage.getListView().getSelectionModel().getSelectedItem();

                for(Person i : Main.persons){
                    if(i.getUserName().equals(username)){
                        memberList.add(i);

                    }

                }


            }
        });
    }
    public void doneButtonController(){

        newChannelPage.getDoneBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String nameChannel = newChannelPage.getChannelNameField().getText();

                Channel channel = new Channel(person,nameChannel,memberList);
                person.getChannel_list().add(channel);

                mainPageController.addNewChannelToListView(nameChannel);

                newChannelPage.getScene().getWindow().hide();


                for( Person per : persons){
                   for(int i=0; i <channel.getMember_list().size() ; i++){
                       if(per.getUserName().equals(channel.getMember_list().get(i).getUserName())){
                            per.getChannel_list().add(channel);
                       }
                   }
                }
                // Write on file  :

                try {

                    FileWriter personChannel = new FileWriter("PersonsChannel.txt");
                    BufferedWriter personChannelBuf = new BufferedWriter(personChannel);

                    for (Person per : Main.persons) {
                        for (int i = 0; i < per.getChannel_list().size(); i++) {
                            personChannelBuf.write(per.getChannel_list().get(i).getName());
                            personChannelBuf.newLine();
                        }
                    }

                    personChannelBuf.close();


                }catch(IOException e ){
                    e.printStackTrace();
                }
                //


                //writeOnFile.writePersonChannels();

            }
        });

    }

    public NewChannelPage getNewChannelPage() {
        return newChannelPage;
    }

    public MainPageController getMainPageController() {
        return mainPageController;
    }

    /*public void chooseButtonController(){

        for(Button i : newChannelPage.getChoose()){
            i.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    i.setText("selected");

                    Label l = new Label();

                    //newChannelPage.getChoose().get(newChannelPage.getListView().getSelectionModel().getSelectedIndex());
                    l = newChannelPage.getUseranemlabels().get(newChannelPage.getListView().getSelectionModel().getSelectedIndex());
                    ArrayList<Person> member_list = new ArrayList<>();

                    for( Person i : persons){
                        if(i.getName().equals(l.getText())){
                            member_list.add(i);
                        }
                        Channel channel = new Channel(Main.person,newChannelPage.getName().getText(),member_list);
                        person.getChannel_list().add(channel);

                        mainPage.getScene().getWindow().hide();


                        MainPageController mainPageController =new MainPageController();
                        Stage mainStage = new Stage();
                        mainStage.setScene(new Scene(mainPageController.getMainPage()));
                        mainStage.show();

                    }


                }
            });

        }





    }
    public void doneButtonController(){

        newChannelPage.getDoneBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                ObservableList data =  FXCollections.observableArrayList();
                //data=newChannelPage.getListView().getItems();
                data.add(newChannelPage.getName());
                //mainPage.getListView().setItems(data);
                ListView listView = new ListView(data);
                //mainPage.getRoot().getChildren().add(listView);

            }
        });
    }


    public NewChannelPage getNewChannelPage() {
        return newChannelPage;
    }*/
}
