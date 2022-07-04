package org.itmo.java.lesson2;

public class Car {
    private String brand;
    private String model;
    private int seatPlace;
    private Color color;
    private long price;
    private double engineCapasity;
    private boolean isNew;

    public Car() {
    }

    public Car(String brand, String model, Color color, boolean isNew) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seatPlace=" + seatPlace +
                ", color=" + color +
                ", price=" + price +
                ", engineCapasity=" + engineCapasity +
                ", isNew=" + isNew +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeatPlace() {
        return seatPlace;
    }

    public void setSeatPlace(int seatPlace) {
        this.seatPlace = seatPlace;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public double getEngineCapasity() {
        return engineCapasity;
    }

    public void setEngineCapasity(double engineCapasity) {
        this.engineCapasity = engineCapasity;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
