package test;

import models.Shape;

public class TestShape {
    public static void main(String[] args) {
        // Shape with default constructor
        Shape shape = new Shape();
        System.out.println(shape);

        // Shape with parameterized constructor
        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);
    }
}
