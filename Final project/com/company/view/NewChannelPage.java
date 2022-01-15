package com.company.view;



//import com.company.Model.Person;
import com.company.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import  static com.company.Main.persons;

import java.util.ArrayList;

public class NewChannelPage extends VBox {

    private ListView<String> listView;
    private Button addBTN;
    private Button doneBTN;
    private TextField channelNameField;



    public NewChannelPage(){



    listView = new ListView<>();
    addBTN = new Button("ADD");
    doneBTN = new Button("Done");
    channelNameField = new TextField();

    VBox menuBox = new VBox(channelNameField, addBTN);


        for (int i = 0; i < Main.persons.size(); i++) {
            if( !persons.get(i).getUserName().equals(Main.person.getUserName())) {
                listView.getItems().add(Main.persons.get(i).getUserName());
            }
    }


        this.getChildren().addAll(menuBox, listView, doneBTN);


   }

    public ListView<String> getListView() {
        return listView;
    }

    public Button getAddBTN() {
        return addBTN;
    }

    public Button getDoneBTN() {
        return doneBTN;
    }

    public TextField getChannelNameField() {
        return channelNameField;
    }
/*private ArrayList<Button> choose = new ArrayList<Button>();
    private TextField name = new TextField();
    private ArrayList<HBox>  personBox = new ArrayList<>(); //
    private ArrayList<Label> useranemlabels = new ArrayList<>(); //
    private Button doneBTN ;



    ObservableList data =  FXCollections.observableArrayList(); //
    final ListView listView = new ListView(data);


    public NewChannelPage(){

        Label channelName = new Label("  Name Channel");
        Label listPeopleChannel = new Label("  choose people inside channel");
        doneBTN = new Button("Done");
            ObservableList data =  FXCollections.observableArrayList();
            final ListView listView = new ListView(data);
        listView.setPrefSize(300, 350);
        listView.setEditable(true);

        for (int i = 0; i < persons.size(); i++) {
            if (!persons.get(i).getName().equals(Main.person.getName())) {
                Label personUsername = new Label(persons.get(i).getName());  //"username"
                getChoose().add(new Button("choose"));
                HBox person = new HBox(personUsername, getChoose().get(i));
                useranemlabels.add(personUsername); //
                person.setSpacing(260);
                data.add(person);
            }
        }

        listView.setItems(data);
        StackPane root = new StackPane();
        root.getChildren().add(listView);
        this.getChildren().addAll(channelName,doneBTN, getName(),listPeopleChannel,root);
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

    public ArrayList<HBox> getPersonBox() {
        return personBox;
    }

    public ListView getListView() {
        return listView;
    }

    public ArrayList<Label> getUseranemlabels() {
        return useranemlabels;
    }

    public void setName(TextField name) {
        this.name = name;
    }

    public Button getDoneBTN() {
        return doneBTN;
    }

    public ObservableList getData() {
        return data;
    }
}*/

}