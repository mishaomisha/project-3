package com.company.controller;


import com.company.Main;
import com.company.view.ChatBoxPage;
import com.company.view.LeftSideMainPage;
import  com.company.controller.ProfilePageController;
import com.company.model.*;

import com.company.view.LoginPage;
import com.company.view.MainPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainPageController  extends VBox {





    private MainPage mainPage ;
    private LoginPage loginPage;
    private NewChannelPageController newChannelPageController;
    boolean channel ;
    boolean personBool ;
    boolean group ;

    WriteOnFile writeOnFile = new WriteOnFile();


    public MainPageController(){

        mainPage = new MainPage();

        channel = false;
        personBool = false;
        group = false;

        myProfileButtonController();
        newChannelButtonController();
        newGroupButtonController();
        logoutButtonController();
        openChatButtonController();



    }




    public void myProfileButtonController(){

        mainPage.getMyProfileBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ProfilePageController profilePageController = new ProfilePageController();
                Stage profilePageStage = new Stage();
                profilePageStage.setScene(new Scene(profilePageController.getProfilePage()) );
                profilePageStage.show();

            }
        });




    }


    public void newChannelButtonController(){

        mainPage.getNewChannelBTN().setOnAction( e -> {

            NewChannelPageController newChannelPageController = new NewChannelPageController(this);
            Stage newChannelStage = new Stage();
            newChannelStage.setScene(new Scene(newChannelPageController.getNewChannelPage()));
            newChannelStage.show();


        });

    }
    public void addNewChannelToListView(String nameChannel){

        mainPage.getListView().getItems().add(nameChannel);


    }


    public void newGroupButtonController(){

        mainPage.getNewGroupBTN().setOnAction( e->{

            NewGroupPageController newGroupPageController = new NewGroupPageController(this);
            Stage newGroupStage = new Stage();
            newGroupStage.setScene(new Scene(newGroupPageController.getNewGroupPage()));
            newGroupStage.show();

        });

    }

    public  void addNewGroupToListView(String nameGroup){
        mainPage.getListView().getItems().add(nameGroup);
    }


    public void openChatButtonController() {


        mainPage.getOpenChatBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String username = mainPage.getListView().getSelectionModel().getSelectedItem();


                for(Person i : Main.persons){
                    if(i.getUserName().equals(username)){
                        personBool=true;
                        Main.receiverPerson=i;
                    }
                }


                for (Channel i : Main.person.getChannel_list()) {
                    if (i.getName().equals(username)) {
                        channel=true;
                        Main.currentChannel=i;


                    }
                }
                for(Grop i : Main.person.getGrop_list()){
                    if(i.getName().equals(username)){
                        group=true;
                        Main.currentGroup=i;


                    }
                }
                if(personBool){

                    PrivateChatPageController privateChatPageController = new PrivateChatPageController();
                    Stage privateChatStage = new Stage();
                    privateChatStage.setScene(new Scene(privateChatPageController.getPrivateChatPage()));
                    privateChatStage.show();


                }
                if(channel){


                    ChannelChatPageController channelChatPageController = new ChannelChatPageController();
                    Stage channelPageStage = new Stage();
                    channelPageStage.setScene(new Scene(channelChatPageController.channelChatPage));
                    channelPageStage.show();



                }
                if(group){

                    GroupChatPageController groupChatPageController = new GroupChatPageController();
                    Stage groupChatStage = new Stage();
                    groupChatStage.setScene(new Scene(groupChatPageController.getGroupChatPage()));
                    groupChatStage.show();

                }
                       writeOnFile.writePersonChannels();

            }
        });

    }

    public void logoutButtonController(){

        mainPage.getLogoutBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainPage.getScene().getWindow().hide();

                LoginPageController loginPageController = new LoginPageController();
                Stage loginPageStage = new Stage();
                loginPageStage.setScene(new Scene(loginPageController.getLoginPage()));
                loginPageStage.show();
            }
        });

    }



    public MainPage getMainPage() {
        return mainPage;
    }


}


    /*private MainPage mainPage ;


    public MainPageController(){

        mainPage = new MainPage();

        newChannelButtonController();
        myProfileButtonController();
        logoutButtonController();
        newGroupButtonController();

    }



    public void newChannelButtonController(){

        mainPage.getNewChannelBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                NewChannelPageController newChannelPageController = new NewChannelPageController();
                Stage newChannelStage = new Stage();
                newChannelStage.setScene(new Scene(newChannelPageController.getNewChannelPage()));
                newChannelStage.show();

            }
        });



    }
    public void logoutButtonController(){

      mainPage.getLogoutBTN().setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {

                      mainPage.getScene().getWindow().hide();

                      LoginPageController loginPageController = new LoginPageController();
                      Stage loginPageStage = new Stage();
                      loginPageStage.setScene(new Scene(loginPageController.getLoginPage()));
                      loginPageStage.show();


          }
      });

    }

    public  void myProfileButtonController(){

        mainPage.getMyProfileBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                ProfilePageController profilePageController =new ProfilePageController();
                Stage profileStage  = new Stage();
                profileStage.setScene(new Scene(profilePageController.getProfilePage()));
                profileStage.show();



            }
        });

    }

    public  void newGroupButtonController(){

        mainPage.getNewGroupBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                NewGroupPageController newGroupPageController = new NewGroupPageController();
                Stage newGroupStage= new Stage();
                newGroupStage.setScene(new Scene(newGroupPageController.getNewGroupPage()) );
                newGroupStage.show();


            }
        });

    }

    public MainPage getMainPage() {
        return mainPage;
    }*/



