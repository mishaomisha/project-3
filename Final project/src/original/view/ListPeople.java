package original.view;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
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

public class ListPeople extends VBox {
    private ArrayList<Button> choose = new ArrayList<Button>();
    private static final ObservableList data =  FXCollections.observableArrayList();

    public ListPeople(){
        final ListView listView = new ListView(getData());
        listView.setPrefSize(300, 350);
        listView.setEditable(true);
        for (int i = 0; i < 6; i++) {//Main.Person.size()+1
            getChoose().add(new Button("Chat"));
            Label personUsername = new Label("username");//Main.Person.get(i).getUserName()
            HBox person = new HBox(personUsername, getChoose().get(i));
            person.setSpacing(100);
            getData().add(person);
        }
        listView.setItems(getData());
        StackPane root = new StackPane();
        root.getChildren().add(listView);
        this.getChildren().addAll(root);
    }

    public static ObservableList getData() {
        return data;
    }

    public ArrayList<Button> getChoose() {
        return choose;
    }

    public void setChoose(ArrayList<Button> choose) {
        this.choose = choose;
    }
}
/*for (int i = 0; i < Main.Grop.size()+1; i++) {
            data.add(Main.Grop.get(i).getName());
        }
        for (int i = 0; i < Main.Channel.size()+1; i++) {
            data.add(Main.Channel.get(i).getName());
        }*/
