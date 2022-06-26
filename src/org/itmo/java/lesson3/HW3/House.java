package org.itmo.java.lesson3.HW3;
import java.util.Calendar;

public class House {
    private Short layers;
    private Integer buildYear;
    private String title;

    public House() {
    }

    public void setAll(Short layers, Integer buildYear, String title) {
        this.layers = layers;
        this.buildYear = buildYear;
        this.title = title;
    }


    @Override
    public String toString() {
        return "House: " + title + ", " +
                layers + ", " +
                buildYear + ", " + SumOfYears();
    }

    private Integer SumOfYears() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - buildYear;
    }
}
