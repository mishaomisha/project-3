package original.view;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import original.Main;
import original.model.Grop;

import java.util.ArrayList;

import static javafx.application.Application.launch;

public abstract class ChatBoxChannel extends VBox {
    private TextField text = new TextField();
    private Button send = new Button("Send");
    public ChatBoxChannel() {
        ObservableList data =  FXCollections.observableArrayList();
        final ListView listView = new ListView(data);
        listView.setPrefSize(300, 350);
        listView.setEditable(true);
        for (int i = 0; i <6 ; i++) {////Main.Grop.get(0).getMessage_list().size()+1
            /*Label sender = new Label(Main.Grop.get(0).getSender_list().get(i));
            Label text = new Label(Main.Grop.get(0).getMessage_list().get(i));
            HBox Message = new HBox(sender,text);
            data.add(Message);*/
            Label sender = new Label("sender");
            Label text = new Label("text");
            HBox Message = new HBox(sender,text);
            Message.setSpacing(15);
            data.add(Message);
        }
        listView.setItems(data);
        StackPane root = new StackPane();
        root.getChildren().add(listView);
        getText().setPrefSize(550,40);
        send.setPrefSize(100,40);
        HBox textPart = new HBox(getText(),send);
        textPart.setSpacing(150);
        this.getChildren().addAll(root,textPart);
        this.setMaxWidth(60);
        this.setMaxHeight(500);

    }

    public TextField getText() {
        return text;
    }

    public void setText(TextField text) {
        this.text = text;
    }

    public Button getSend() {
        return send;
    }

    public void setSend(Button send) {
        this.send = send;
    }
}
