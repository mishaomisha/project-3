package com.company.controller;

import com.company.Main;
import com.company.model.Channel;
import com.company.model.Person;
import com.company.model.Grop;
import com.company.view.MainPage;
import  com.company.view.NewGroupPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.ArrayList;

import static com.company.Main.person;
import static com.company.Main.persons;

public class NewGroupPageController {



    NewGroupPage newGroupPage ;
    MainPageController mainPageController ;
    ArrayList<Person> memberList;

    WriteOnFile writeOnFile = new WriteOnFile();


    public NewGroupPageController(MainPageController mainPageController){

        newGroupPage = new NewGroupPage();
        this.mainPageController=mainPageController;
        memberList = new ArrayList<>();

        addButtonController();
        doneButtonController();

    }


    public void addButtonController(){

        newGroupPage.getAddBTN().setOnAction(e ->{

            String username = newGroupPage.getListView().getSelectionModel().getSelectedItem();

            for(Person i : Main.persons){
                if(i.getUserName().equals(username)){
                    memberList.add(i);
                }

            }


        });

    }

    public  void doneButtonController(){

        newGroupPage.getDoneBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String nameGroup = newGroupPage.getGroupNameField().getText();

                Grop group = new Grop(nameGroup,Main.person,memberList);
                Main.person.getGrop_list().add(group);

                mainPageController.addNewGroupToListView(nameGroup);

                newGroupPage.getScene().getWindow().hide();


                for(Person per : persons){
                    for(int i=0; i <group.getMember_list().size() ; i++){
                        if(per.getUserName().equals(group.getMember_list().get(i))){
                             per.getGrop_list().add(group);
                        }
                    }
                }

                 writeOnFile.writePersonGroups();
            }
        });



    }

    public NewGroupPage getNewGroupPage() {
        return newGroupPage;
    }

    public MainPageController getMainPageController() {
        return mainPageController;
    }

    public ArrayList<Person> getMemberList() {
        return memberList;
    }
}





    /*NewGroupPage newGroupPage ;
    MainPage mainPage;

    public NewGroupPageController(){

        newGroupPage = new NewGroupPage();
        mainPage = new MainPage();
        chooseButtonController();
    }




    public void chooseButtonController(){

        for(Button i : newGroupPage.getChoose()){
            i.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    i.setText("selected");

                    Label l = new Label();

                    //newChannelPage.getChoose().get(newChannelPage.getListView().getSelectionModel().getSelectedIndex());
                    l = newGroupPage.getUseranemlabels().get(newGroupPage.getListView().getSelectionModel().getSelectedIndex());
                    ArrayList<Person> member_list = new ArrayList<>();

                    for( Person i : persons){
                        if(i.getName().equals(l.getText())){
                            member_list.add(i);
                        }
                        Channel channel = new Channel(Main.person,newGroupPage.getName().getText(),member_list);
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


    public NewGroupPage getNewGroupPage() {
        return newGroupPage;
    }
}*/
