package com.company.view;

import com.company.Main;
import com.company.model.Person;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

public class ChannelSettingsPage  extends VBox {

    ListView<String>  member_list;
    Label namesLBL;



    public ChannelSettingsPage(){

        member_list = new ListView<>();
        namesLBL = new Label("Members : ");

        for(Person per : Main.currentChannel.getMember_list()){
             member_list.getItems().add(per.getUserName());
        }

        this.getChildren().addAll(member_list);

    }


}
