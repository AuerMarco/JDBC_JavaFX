//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

public class Invoice {
    private int id;
    private String date;
    private String description;
    private double value;
    private int paid;

    public Invoice(String date, String description, double value, int paid) {
        this.date = date;
        this.description = description;
        this.value = value;
        this.paid = paid;
    }

    public Invoice(int id, String date, String description, double value, int paid) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.value = value;
        this.paid = paid;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getPaid() {
        return this.paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public String toString() {
        return "Invoice{id=" + this.id + ", date='" + this.date + '\'' + ", description='" + this.description + '\'' + ", value=" + this.value + ", paid=" + this.paid + '}';
    }
}
