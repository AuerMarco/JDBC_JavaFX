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

public class Loeschen {
    private InvoiceDaoImpl invoice = new InvoiceDaoImpl();
    private int id;
    @FXML
    private Label label_entry;
    @FXML
    private Label label_deleteSuccess;

    public Loeschen() {
    }

    private boolean IDcheck(int id) {
        Invoice inv = this.invoice.showByID(id);
        return inv != null;
    }

    public void onLoad(int id) {
        this.id = id;
        String paid = "";
        Invoice inv = this.invoice.showByID(id);
        if (inv == null) {
            this.label_entry.setText("Kein Eintrag mit dieser ID vorhanden!");
        } else {
            if (inv.getPaid() == 0) {
                paid = "Nein ";
            } else {
                paid = "Ja";
            }

            this.label_entry.setText("ID: " + inv.getId() + ", Datum: " + inv.getDate() + ", Beschreibung: " + inv.getDescription() + ", Preis: " + inv.getValue() + ", Bezahlt: " + paid);
        }

    }

    @FXML
    void delete(ActionEvent event) {
        if (this.IDcheck(this.id)) {
            this.invoice.deleteInvoice(this.id);
            this.label_entry.setText("Eintrag wurde gelöscht!");
        }

    }
}
