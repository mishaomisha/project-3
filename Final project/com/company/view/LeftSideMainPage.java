package com.company.view;



import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.company.Main;

public  abstract class LeftSideMainPage extends VBox {

    ObservableList data =  FXCollections.observableArrayList();





    public LeftSideMainPage() {
        /*int personNumber = 0;
        Label profile = new Label(Main.persons.get(0).getName());///Main.Person.get().getUserName()

        //ObservableList data =  FXCollections.observableArrayList();
        final ListView listView = new ListView(data);
        listView.setPrefSize(300, 350);
        listView.setEditable(true);
        for (int i = 0; i < 6; i++) {//Main.Grop.size()+1
            for(int j = 0;j< 6;j++){//Main.Person.size()+1
                //if(Main.Grop.get(i).getMember_list().get(j)==Main.Person.get()){
                //    data.add(Main.Grop.get(i).getName());
                //}
                data.add("nameGrop");
            }
        }
        for (int i = 0; i < 6; i++) {//Main.Channel.size()+1
            for(int j = 0;j< 6;j++){//Main.Person.size()+1
                //if(Main.Channel.get(i).getMember_list().get(j)==Main.Person.get(0)){
                //    data.add(Main.Channel.get(i).getName());
                //}
                data.add("nameChannel");
            }
        }
        listView.setItems(data);
        StackPane root = new StackPane();
        root.getChildren().add(listView);
        this.getChildren().addAll(profile,root);*/

    }

    public ObservableList getData() {
        return data;
    }
}
