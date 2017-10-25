//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample.controller;

import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.Invoice;
import sample.InvoiceDaoImpl;

public class Aktualisieren {
    private InvoiceDaoImpl invoice = new InvoiceDaoImpl();
    @FXML
    private TextField input_id;
    @FXML
    private DatePicker input_date;
    @FXML
    private TextField input_description;
    @FXML
    private TextField input_value;
    @FXML
    private CheckBox input_paid;
    @FXML
    private Label label_currentEntry;

    public Aktualisieren() {
    }

    @FXML
    void updating(ActionEvent event) {
        int tinyInt = 0;
        if (this.input_paid.isSelected()) {
            tinyInt = 1;
        }

        this.invoice.updateInvoice(Integer.parseInt(this.input_id.getText()), (LocalDate)this.input_date.getValue(), this.input_description.getText(), Double.parseDouble(this.input_value.getText()), tinyInt);
        String paid = "";
        Invoice inv = this.invoice.showByID(Integer.parseInt(this.input_id.getText()));
        if (inv == null) {
            this.label_currentEntry.setText("Kein Eintrag mit dieser ID vorhanden!");
        } else {
            if (inv.getPaid() == 0) {
                paid = "Nein";
            } else {
                paid = "Ja";
            }

            this.label_currentEntry.setText("ID: " + inv.getId() + ", Datum: " + inv.getDate() + ", Beschreibung: " + inv.getDescription() + ", Preis: " + inv.getValue() + ", Bezahlt: " + paid);
        }

    }
}
