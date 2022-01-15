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

public class GroupChatPage extends VBox {


    private ListView<String> chat_List ;
    private TextField messageField;
    private Label groupName ;
    private Button sendBTN ;


    public  GroupChatPage(){


        chat_List = new ListView<>();
        messageField = new TextField();
        groupName = new Label(Main.currentGroup.getName());
        sendBTN = new Button("Send");



        HBox box = new HBox(messageField,sendBTN);
        box.setSpacing(15);




        this.chat_List.getItems().addAll(Main.currentGroup.getChat_list());



        this.getChildren().addAll(groupName,chat_List,box);


    }

    public ListView<String> getChat_List() {
        return chat_List;
    }

    public TextField getMessageField() {
        return messageField;
    }

    public Label getGroupName() {
        return groupName;
    }

    public Button getSendBTN() {
        return sendBTN;
    }

}