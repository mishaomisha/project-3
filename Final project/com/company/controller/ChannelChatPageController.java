package com.company.controller;

import com.company.view.ChannelChatPage;
import com.company.view.ChannelSettingsPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChannelChatPageController {

    ChannelChatPage channelChatPage;


    public ChannelChatPageController(){

        channelChatPage = new ChannelChatPage();

        sendButtonController();
        settingButtonController();
    }

    public void sendButtonController(){

        channelChatPage.getSendBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String post = channelChatPage.getMessageField().getText();
                channelChatPage.getPosts().getItems().add(post);
                channelChatPage.getMessageField().clear();


            }
        });

    }

    public void settingButtonController(){
        channelChatPage.getSettingBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ChannelSettingsPageController channelSettingsPageController = new ChannelSettingsPageController();
                Stage channelSettingStage = new Stage();
                channelSettingStage.setScene(new Scene(channelSettingsPageController.getChannelSettingsPage()));
                channelSettingStage.show();
            }
        });
    }

    public ChannelChatPage getChannelChatPage() {
        return channelChatPage;
    }
}
