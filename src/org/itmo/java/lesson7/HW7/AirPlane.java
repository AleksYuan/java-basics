package org.itmo.java.lesson7.HW7;

public class AirPlane {
    protected String name;
    protected int weightOfPlane;
    private final WindOfPlane windOfPlane;


    public class WindOfPlane {
        private int weightOfWing;

        public void setWeightOfWing(int weightOfWing) {
            this.weightOfWing = weightOfWing;
        }

        public int getWeightOfWing() {
            return weightOfWing;
        }

        @Override
        public String toString() {
            return "WindOfPlane{" +
                    "weightOfWing=" + weightOfWing +
                    '}';
        }
    }

    public AirPlane(String name, int weightOfPlane, int weightOfWing) {
        this.name = name;
        this.weightOfPlane = weightOfPlane;
        windOfPlane = new WindOfPlane();
//        this.windOfPlane = windOfPlane;
        this.windOfPlane.setWeightOfWing(weightOfWing);
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "name='" + name + '\'' +
                ", weightOfPlane=" + weightOfPlane +
                ", weightOfWing=" + windOfPlane.getWeightOfWing() +
                '}';
    }
}
