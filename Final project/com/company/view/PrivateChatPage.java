package com.company.view;

import com.company.Main;
import com.company.model.Chat;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import com.company.model.Chat;

public class PrivateChatPage extends VBox {


    private ListView<String> chat_List ;
    private TextField messageField;
    private Label name ;
    private Button blockBTN;
    private Button sendBTN ;
    private Chat currentChatList;

    public  PrivateChatPage(){

        chat_List = new ListView<>();
        messageField = new TextField();
        blockBTN = new Button("Block");
        name = new Label(Main.receiverPerson.getName());
        sendBTN = new Button("Send");
        currentChatList = new Chat();

        HBox hBox = new HBox(name,blockBTN);
        HBox box = new HBox(messageField,sendBTN);
        box.setSpacing(70);



        for(Chat i : Main.person.getChat_list()){
            if(i.getReceiver().equals(Main.receiverPerson) && i.getSender().equals(Main.person)){
                currentChatList=i;



            }
        }


        this.chat_List.getItems().addAll(currentChatList.getChat_list());



        this.getChildren().addAll(hBox,chat_List,box);


    }

    public ListView<String> getChat_List() {
        return chat_List;
    }

    public TextField getMessageField() {
        return messageField;
    }

    public Label getName() {
        return name;
    }

    public Button getSendBTN() {
        return sendBTN;
    }

    public Button getBlockBTN() {
        return blockBTN;
    }

    public Chat getCurrentChatList() {
        return currentChatList;
    }
}

