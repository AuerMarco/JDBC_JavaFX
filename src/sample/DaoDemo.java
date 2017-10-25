//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

import java.time.LocalDate;

public class DaoDemo {
    public DaoDemo() {
    }

    public static void main(String[] args) {
        InvoiceDaoImpl invoice = new InvoiceDaoImpl();
        LocalDate today = LocalDate.now();
        invoice.showAllInvoices();
        System.out.println("Single entry");
        System.out.println(invoice.showByID(13));
    }
}
