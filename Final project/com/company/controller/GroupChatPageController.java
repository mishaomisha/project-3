package com.company.controller;

import com.company.view.GroupChatPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class GroupChatPageController {

    GroupChatPage groupChatPage;


    public GroupChatPageController(){

        groupChatPage = new GroupChatPage();
        sendButtonController();
    }



    public void sendButtonController(){
        groupChatPage.getSendBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String message = groupChatPage.getMessageField().getText();
                groupChatPage.getChat_List().getItems().add(message);
                groupChatPage.getMessageField().clear();



            }
        });
    }

    public GroupChatPage getGroupChatPage(){
        return groupChatPage;
    }
}
