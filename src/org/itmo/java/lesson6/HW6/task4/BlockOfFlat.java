package org.itmo.java.lesson6.HW6.task4;

public class BlockOfFlat extends Flat{
    public byte flatCount;
    public Integer fullArea;

    public BlockOfFlat(Integer area, short lenght, short width, byte flatCount, Integer fullArea) {
        super(area, lenght, width);
        this.flatCount = flatCount;
        this.fullArea = fullArea;
    }


    @Override
    public Integer getSomeVariable() {
        return super.getSomeVariable();
    }
}
