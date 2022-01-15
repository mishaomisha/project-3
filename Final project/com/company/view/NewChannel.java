package com.company.view;


import com.company.Main;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public abstract class NewChannel extends VBox {
    private ArrayList<Button> choose = new ArrayList<Button>();
    private TextField name = new TextField();
    public NewChannel(){

        Label channelName = new Label("  Name Channel");
        Label listPeopleChannel = new Label("  choose people inside channel");
        ObservableList data =  FXCollections.observableArrayList();
        final ListView listView = new ListView(data);
        listView.setPrefSize(300, 350);
        listView.setEditable(true);
        for (int i = 0; i < 6; i++) {
            Label personUsername = new Label("username");
            getChoose().add(new Button("choose"));
            HBox person = new HBox(personUsername, getChoose().get(i));
            person.setSpacing(260);
            data.add(person);
        }
        listView.setItems(data);
        StackPane root = new StackPane();
        root.getChildren().add(listView);
        this.getChildren().addAll(channelName, getName(),listPeopleChannel,root);
        this.setSpacing(10);
        this.setMaxWidth(300);
    }

    public ArrayList<Button> getChoose() {
        return choose;
    }

    public void setChoose(ArrayList<Button> choose) {
        this.choose = choose;
    }

    public TextField getName() {
        return name;
    }

    public void setName(TextField name) {
        this.name = name;
    }
}
