package com.company.controller;

import com.company.Main;
import com.company.view.PrivateChatPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class PrivateChatPageController {

    PrivateChatPage privateChatPage ;

    WriteOnFile writeOnFile = new WriteOnFile();


    public PrivateChatPageController(){

        privateChatPage = new PrivateChatPage();
        sendButtonController();
        blockButtonController();

    }

    public  void sendButtonController(){

        privateChatPage.getSendBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String message = privateChatPage.getMessageField().getText();
                privateChatPage.getChat_List().getItems().add(message);

                privateChatPage.getMessageField().clear();

                writeOnFile.writePersonChat();

            }
        });

    }
   public void blockButtonController(){

        privateChatPage.getBlockBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Main.receiverPerson.getBlock().setBlock(true);
                Main.receiverPerson.getBlock().setReceiver(Main.receiverPerson);
                privateChatPage.getBlockBTN().setText("Unblock");

            }
        });
   }


    public PrivateChatPage getPrivateChatPage() {
        return privateChatPage;
    }
}


