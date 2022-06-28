package org.itmo.java.lesson3.HW3;

public class HouseNew {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();

        house1.setAll((short)20, 1988, "Хрущевка, 5 этажей");
        house2.setAll((short)70, 2025, "небоскреб в проекте");

        System.out.println(house1.toString());
        System.out.println(house2.toString());
    }
}
