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

public class ChannelChatPage extends VBox {


    private ListView<String> posts ;
    private TextField messageField;
    private Label channelName ;
    private Button sendBTN ;
    private Button settingBTN;


    public ChannelChatPage(){


        channelName = new Label(Main.currentChannel.getName());
        posts = new ListView<>();
        messageField = new TextField();
        sendBTN = new Button("Send");
        settingBTN = new Button("setting");


        HBox hBox = new HBox(channelName,settingBTN);
        hBox.setSpacing(35);

        HBox box = new HBox(messageField,sendBTN);
        box.setSpacing(70);


        if(! Main.currentChannel.getPosts().isEmpty()) {

            this.posts.getItems().addAll(Main.currentChannel.getPosts());
        }



        this.getChildren().addAll(hBox,settingBTN,posts,box);


    }

    public ListView<String> getPosts() {
        return posts;
    }

    public TextField getMessageField() {
        return messageField;
    }

    public Label getChannelName() {
        return channelName;
    }

    public Button getSendBTN() {
        return sendBTN;
    }

    public Button getSettingBTN() {
        return settingBTN;
    }
}


