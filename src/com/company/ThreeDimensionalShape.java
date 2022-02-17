package com.company;

public abstract class ThreeDimensionalShape extends Shape {

    public abstract double getArea();

    public abstract double getVolume();

    @Override
    public String toString() {
        return String.format("%sArea: %.2f Volume: %.2f%n", super.toString(), getArea(), getVolume());
    }
}
