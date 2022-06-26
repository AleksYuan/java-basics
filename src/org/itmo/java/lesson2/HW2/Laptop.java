package org.itmo.java.lesson2.HW2;

import org.itmo.java.lesson2.Color;

public class Laptop {

    private Brand brand;
    private String model;
    private int inchMonic;
    private Color color;
    private long price;
    private boolean Formtype;
    private String size;

    public Laptop() {}

    public Laptop(Brand brand, int inchMonic, long price, String size) {
        this.brand = brand;
        this.inchMonic = inchMonic;
        this.price = price;
        this.size = size;
    }

    public Laptop(Brand brand, String model, int inchMonic, Color color, long price, boolean formtype, String size) {
        this.brand = brand;
        this.model = model;
        this.inchMonic = inchMonic;
        this.color = color;
        this.price = price;
        Formtype = formtype;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", inchMonic=" + inchMonic +
                ", color=" + color +
                ", price=" + price +
                ", Formtype=" + Formtype +
                ", size='" + size + '\'' +
                '}';
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
