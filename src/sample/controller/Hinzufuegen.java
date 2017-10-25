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

public class Hinzufuegen {
    private InvoiceDaoImpl invoice = new InvoiceDaoImpl();
    @FXML
    private DatePicker input_date;
    @FXML
    private TextField input_description;
    @FXML
    private TextField input_value;
    @FXML
    private CheckBox input_paid;
    @FXML
    private Label label_insertOutput;

    public Hinzufuegen() {
    }

    @FXML
    void insert(ActionEvent event) {
        int tinyInt = 0;
        if (this.input_paid.isSelected()) {
            tinyInt = 1;
        }

        this.invoice.addInvoice((LocalDate)this.input_date.getValue(), this.input_description.getText(), Double.parseDouble(this.input_value.getText()), tinyInt);
        String paid = "";
        int arraySize = this.invoice.getAllInvoices().size() - 1;
        if (((Invoice)this.invoice.getAllInvoices().get(arraySize)).getPaid() == 0) {
            paid = "Nein";
        } else {
            paid = "Ja";
        }

        this.label_insertOutput.setText("ID: " + ((Invoice)this.invoice.getAllInvoices().get(arraySize)).getId() + ", Datum: " + ((Invoice)this.invoice.getAllInvoices().get(arraySize)).getDate() + ", Beschreibung: " + ((Invoice)this.invoice.getAllInvoices().get(arraySize)).getDescription() + ", Preis: " + ((Invoice)this.invoice.getAllInvoices().get(arraySize)).getValue() + ", Bezahlt: " + paid);
    }
}
