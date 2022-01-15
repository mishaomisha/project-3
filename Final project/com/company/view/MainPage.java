package com.company.view;

import com.company.Main.*;
import com.company.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class MainPage extends VBox {

    private ListView<String> listView;
    private Button myProfileBTN;
    private Button newGroupBTN;
    private Button newChannelBTN;
    private Button logoutBTN;
    private Button openChatBTN;


    public MainPage(){


        listView = new ListView<>();

        newChannelBTN = new Button("+New Channel");
        newGroupBTN = new Button("+New Group");
        myProfileBTN = new Button("My Profile");
        logoutBTN = new Button("Logout");
        openChatBTN = new Button("Open");
        Label nameLBL = new Label(Main.person.getName());

        HBox menuBox = new HBox(myProfileBTN,newChannelBTN,newGroupBTN,logoutBTN,openChatBTN);



        if(!Main.persons.isEmpty()){
            for(int i =0; i < Main.persons.size() ; i ++) {
                if (!Main.persons.get(i).getUserName().equals(Main.person.getUserName())) {
                    listView.getItems().add(Main.persons.get(i).getUserName());
                }
            }
        }

        this.getChildren().addAll(nameLBL,menuBox,listView);



    }

    public ListView<String> getListView() {
        return listView;
    }

    public Button getMyProfileBTN() {
        return myProfileBTN;
    }

    public Button getNewGroupBTN() {
        return newGroupBTN;
    }

    public Button getNewChannelBTN() {
        return newChannelBTN;
    }

    public Button getLogoutBTN() {
        return logoutBTN;
    }

    public Button getOpenChatBTN() {
        return openChatBTN;
    }

    /*private Button myProfileBTN;
    private Button newChannelBTN;
    private Button newGroupBTN;
    private Button logoutBTN ;
    private Label nothingLBL;

    public Button getMyProfileBTN() {
        return myProfileBTN;
    }

    public Button getNewChannelBTN() {
        return newChannelBTN;
    }

    public Button getNewGroupBTN() {
        return newGroupBTN;
    }

    public Button getLogoutBTN() {
        return logoutBTN;
    }

    public Label getNothingLBL() {
        return nothingLBL;
    }

    public MainPage() {

        int personNumber = 0;
        Label profile = new Label(Main.person.getName());///Main.Person.get().getUserName()
        ObservableList data = FXCollections.observableArrayList();
        //ObservableList data =  FXCollections.observableArrayList();
        final ListView listView = new ListView(data);
        newChannelBTN = new Button("+New Channel");
        newGroupBTN = new Button("+New Group");
        myProfileBTN = new Button("My Profile");
        logoutBTN = new Button("Logout");
        HBox menuBox = new HBox(myProfileBTN,newChannelBTN,newGroupBTN,logoutBTN);
        menuBox.setSpacing(3);
        listView.setPrefSize(300, 350);
        listView.setEditable(true);

        if(! Main.person.getGrop_list().isEmpty()) {

            for (int i = 0; i < Main.person.getGrop_list().size(); i++) {//Main.Grop.size()+1

                //for (int j = 0; j < 6; j++) {//Main.Person.size()+1
                //if(Main.Grop.get(i).getMember_list().get(j)==Main.Person.get()){
                //    data.add(Main.Grop.get(i).getName());
                //}
                // }
                data.add(Main.person.getGrop_list().get(i).getName()); //nameGrop

            }
        }
        if(! Main.person.getChannel_list().isEmpty()) {
            for (int i = 0; i < Main.person.getChannel_list().size(); i++) {//Main.Channel.size()+1
                //for (int j = 0; j < 6; j++) {//Main.Person.size()+1
                //if(Main.Channel.get(i).getMember_list().get(j)==Main.Person.get(0)){
                //    data.add(Main.Channel.get(i).getName());
                //}
                //}
                data.add(Main.person.getChannel_list().get(i).getName());  //nameChannel

            }
        }
        listView.setItems(data);
        StackPane root = new StackPane();
        root.getChildren().add(listView);
        this.getChildren().addAll(profile, menuBox, root);



    }*/
}

