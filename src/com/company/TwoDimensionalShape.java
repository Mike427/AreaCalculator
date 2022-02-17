package com.company;

public abstract class TwoDimensionalShape extends Shape {

    public abstract double getArea();

    @Override
    public String toString() {
        return String.format("%sArea: %.2f%n", super.toString(), getArea());
    }
}
