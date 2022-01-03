package original.view;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import original.Main;

import java.util.ArrayList;

import static original.view.ListPeople.getData;

public abstract class LeftSideMainPage extends VBox {
    private ArrayList<Button> open = new ArrayList<Button>();
    ObservableList data =  FXCollections.observableArrayList();
    public LeftSideMainPage() {
        final ListView listView = new ListView(getData());
        listView.setPrefSize(300, 350);
        listView.setEditable(true);
        int personNumber = 0;
        Label profile = new Label("username");///Main.Person.get().getUserName()
        listView.setPrefSize(300, 350);
        listView.setEditable(true);
        for (int i = 0; i < 6; i++) {//Main.Grop.size()+1
            for(int j = 0;j< 6;j++){//Main.Person.size()+1
                /*if(Main.Grop.get(i).getMember_list().get(j)==Main.Person.get()){
                    getOpen().add(new Button("Open"));
                    Label name = new Label(Main.Grop.get(i).getName());
                    HBox person = new HBox(name, getOpen().get(i));
                    person.setSpacing(100);
                    getData().add(person);
                }*/
                data.add("nameGrop");
            }
        }
        for (int i = 0; i < 6; i++) {//Main.Channel.size()+1
            for(int j = 0;j< 6;j++){//Main.Person.size()+1
                /*if(Main.Channel.get(i).getMember_list().get(j)==Main.Person.get(0)){
                    getOpen().add(new Button("Open"));
                    Label name = new Label(Main.Channel.get(i).getName());
                    HBox person = new HBox(name, getOpen().get(i));
                    person.setSpacing(100);
                    getData().add(person);
                }*/
                data.add("nameChannel");
            }
        }
        listView.setItems(data);
        StackPane root = new StackPane();
        root.getChildren().add(listView);
        this.getChildren().addAll(profile,root);

    }

    public ArrayList<Button> getOpen() {
        return open;
    }

    public void setOpen(ArrayList<Button> open) {
        this.open = open;
    }
}
