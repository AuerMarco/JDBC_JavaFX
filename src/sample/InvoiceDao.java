//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

import java.time.LocalDate;
import java.util.ArrayList;

public interface InvoiceDao {
    ArrayList<Invoice> getAllInvoices();

    void showAllInvoices();

    Invoice showByID(int var1);

    void addInvoice(LocalDate var1, String var2, double var3, int var5);

    void updateInvoice(int var1, LocalDate var2, String var3, double var4, int var6);

    void deleteInvoice(int var1);
}
