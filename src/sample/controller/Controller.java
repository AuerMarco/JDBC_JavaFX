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
import javafx.stage.Stage;

public class Controller {
    Stage secondStage = new Stage();
    Parent root = null;

    public Controller() {
    }

    @FXML
    void anzeigen(ActionEvent event) {
        try {
            this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../anzeigen.fxml"));
            this.secondStage.setTitle("Rechnungen: Anzeigen");
            this.secondStage.setScene(new Scene(this.root));
            this.secondStage.show();
        } catch (IOException var3) {
            var3.printStackTrace();
        }

    }

    @FXML
    void hinzufuegen(ActionEvent event) {
        try {
            this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../hinzufuegen.fxml"));
            this.secondStage.setTitle("Rechnungen: Hinzufügen");
            this.secondStage.setScene(new Scene(this.root));
            this.secondStage.show();
        } catch (IOException var3) {
            var3.printStackTrace();
        }

    }

    @FXML
    void aktualisieren(ActionEvent event) {
        try {
            this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../aktualisieren.fxml"));
            this.secondStage.setTitle("Rechnungen: Aktualisieren");
            this.secondStage.setScene(new Scene(this.root));
            this.secondStage.show();
        } catch (IOException var3) {
            var3.printStackTrace();
        }

    }

    @FXML
    void loeschen(ActionEvent event) {
        try {
            this.root = (Parent)FXMLLoader.load(this.getClass().getResource("../loeschenID.fxml"));
            this.secondStage.setTitle("Rechnungen: Löschen");
            this.secondStage.setScene(new Scene(this.root));
            this.secondStage.show();
        } catch (IOException var3) {
            var3.printStackTrace();
        }

    }
}
