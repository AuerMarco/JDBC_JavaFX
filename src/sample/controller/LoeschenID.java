//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoeschenID {
    private Stage delete = new Stage();
    private Parent root = null;
    @FXML
    private TextField input_loeschID;

    public LoeschenID() {
    }

    @FXML
    void sendID(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("../loeschen.fxml"));
            this.root = (Parent)loader.load();
            Loeschen loeschen = (Loeschen)loader.getController();
            int index = 0;
            if (!this.input_loeschID.getText().equals("")) {
                index = Integer.parseInt(this.input_loeschID.getText());
            }

            loeschen.onLoad(index);
            this.delete.setTitle("Rechnungen: Löschen");
            this.delete.setScene(new Scene(this.root));
            this.delete.show();
        } catch (IOException var5) {
            var5.printStackTrace();
        }

    }
}
