package ss17_binary_file_and_serialization.bai_tap.bai_1.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double price;
    private String export;
    private String describe;

    public Product() {
    }

    public Product(int id, String name, double price, String export, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.export = export;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", export='" + export + '\'' +
                ", describe='" + describe + '\'';
    }
}
