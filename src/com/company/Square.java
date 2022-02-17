package com.company;

public class Square extends TwoDimensionalShape {

    private double side;


    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);
    }
}
