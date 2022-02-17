package com.company;

public class ShapeTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(9),
                new Square(9),
                new Triangle(9, 9),
                new Sphere(9),
                new Cube(9),
                new Tetrahedron(9)
        };

        for (Shape currentShape : shapes) {
            if (currentShape instanceof TwoDimensionalShape) {
                System.out.printf("%s%n", currentShape.toString());
            } else if (currentShape instanceof ThreeDimensionalShape) {
                System.out.printf("%s%n", currentShape.toString());

            }
        }
    }
}
