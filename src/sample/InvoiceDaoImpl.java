//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class InvoiceDaoImpl implements InvoiceDao {
    ConnectionSingleton single = ConnectionSingleton.getConnector();

    public InvoiceDaoImpl() {
    }

    public ArrayList<Invoice> getAllInvoices() {
        ArrayList invoices = new ArrayList();

        try {
            Statement state = this.single.getConnection().createStatement();
            ResultSet result = state.executeQuery("select * from invoice");

            while(result.next()) {
                Invoice invoice = new Invoice(result.getInt("id"), result.getString("date"), result.getString("description"), (double)result.getInt("value"), result.getInt("paid"));
                invoices.add(invoice);
            }

            return invoices;
        } catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public void showAllInvoices() {
        Iterator var1 = this.getAllInvoices().iterator();

        while(var1.hasNext()) {
            Invoice invoice = (Invoice)var1.next();
            System.out.println("ID: " + invoice.getId() + ", Date: " + invoice.getDate() + ", Description: " + invoice.getDescription() + ", Value: " + invoice.getValue() + ", Paid: " + invoice.getPaid());
        }

    }

    public Invoice showByID(int id) {
        Invoice invoiceSingle = null;

        try {
            Iterator var3 = this.getAllInvoices().iterator();

            while(var3.hasNext()) {
                Invoice inv = (Invoice)var3.next();
                if (inv.getId() == id) {
                    invoiceSingle = new Invoice(inv.getId(), inv.getDate(), inv.getDescription(), inv.getValue(), inv.getPaid());
                }
            }

            return invoiceSingle;
        } catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public void addInvoice(LocalDate date, String description, double value, int paid) {
        try {
            PreparedStatement state = this.single.getConnection().prepareStatement("insert into invoice (id, date, description, value, paid) values (NULL, ?, ?, ?, ?)");
            state.setDate(1, Date.valueOf(date));
            state.setString(2, description);
            state.setDouble(3, value);
            state.setInt(4, paid);
            state.execute();
            System.out.println("\nInsert complete");
        } catch (Exception var7) {
            var7.printStackTrace();
        }

    }

    public void updateInvoice(int id, LocalDate date, String description, double value, int paid) {
        try {
            PreparedStatement state = this.single.getConnection().prepareStatement("UPDATE invoice SET date = ?, DESCRIPTION = ?, value = ?, paid = ? WHERE id = ?");
            state.setDate(1, Date.valueOf(date));
            state.setString(2, description);
            state.setDouble(3, value);
            state.setInt(4, paid);
            state.setInt(5, id);
            state.executeUpdate();
            System.out.println("\nUpdate complete");
        } catch (Exception var8) {
            var8.printStackTrace();
        }

    }

    public void deleteInvoice(int id) {
        try {
            PreparedStatement state = this.single.getConnection().prepareStatement("DELETE FROM invoice WHERE id = ?");
            state.setInt(1, id);
            state.executeUpdate();
            System.out.println("\nDeletion complete");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }
}
