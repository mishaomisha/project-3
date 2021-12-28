package original.view;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import original.Main;
public class ListPeople {
    public static final ObservableList data =  FXCollections.observableArrayList();
    public void start(Stage primaryStage) {
        final ListView listView = new ListView(data);
        listView.setPrefSize(200, 250);
        listView.setEditable(true);

        for (int i = 0; i < Main.Person.size(); i++) {
            data.add(Main.Person.get(i).getUserName());
        }
        listView.setItems(data);

        StackPane root = new StackPane();
        root.getChildren().add(listView);
        primaryStage.setScene(new Scene(root, 200, 250));
        primaryStage.show();
    }
}
