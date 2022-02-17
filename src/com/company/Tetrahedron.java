package com.company;

public class Tetrahedron extends ThreeDimensionalShape {


    private double edgeLength;

    public Tetrahedron(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(getEdgeLength(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getEdgeLength(), 3) / (6 * Math.sqrt(2));
    }

}
