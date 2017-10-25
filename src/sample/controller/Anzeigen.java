//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import sample.Invoice;
import sample.InvoiceDaoImpl;

public class Anzeigen {
    private InvoiceDaoImpl invoice = new InvoiceDaoImpl();
    private int counter = 0;
    @FXML
    private Label label_id;
    @FXML
    private Label label_date;
    @FXML
    private Label label_description;
    @FXML
    private Label label_value;
    @FXML
    private Label label_paid;

    public Anzeigen() {
    }

    @FXML
    void first(ActionEvent event) {
        this.counter = 0;
        this.changeLabels();
    }

    @FXML
    void previous(ActionEvent event) {
        if (this.counter - 1 < 0) {
            this.counter = this.invoice.getAllInvoices().size() - 1;
        } else {
            --this.counter;
        }

        this.changeLabels();
    }

    @FXML
    void next(ActionEvent event) {
        if (this.counter + 1 >= this.invoice.getAllInvoices().size()) {
            this.counter = 0;
        } else {
            ++this.counter;
        }

        this.changeLabels();
    }

    @FXML
    void last(ActionEvent event) {
        this.counter = this.invoice.getAllInvoices().size() - 1;
        this.changeLabels();
    }

    public void changeLabels() {
        this.label_id.setText("" + ((Invoice)this.invoice.getAllInvoices().get(this.counter)).getId());
        this.label_date.setText("" + ((Invoice)this.invoice.getAllInvoices().get(this.counter)).getDate());
        this.label_description.setText("" + ((Invoice)this.invoice.getAllInvoices().get(this.counter)).getDescription());
        this.label_value.setText("" + ((Invoice)this.invoice.getAllInvoices().get(this.counter)).getValue());
        if (((Invoice)this.invoice.getAllInvoices().get(this.counter)).getPaid() == 0) {
            this.label_paid.setText("Nein");
        } else {
            this.label_paid.setText("Ja");
        }

    }
}
