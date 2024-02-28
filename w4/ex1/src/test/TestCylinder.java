package test;

import models.Cylinder;

public class TestCylinder { // save as "TestCylinder.java"
        public static void main(String[] args) {
                // ** Test Cylinder class ** //
                // Declare and allocate a new instance of cylinder
                // with default color, radius, and height
                Cylinder c1 = new Cylinder();
                System.out.println("Cylinder:"
                                + " radius=" + c1.getRadius()
                                + " height=" + c1.getHeight()
                                + " base area=" + c1.getArea()
                                + " volume=" + c1.getVolume());

                // Declare and allocate a new instance of cylinder
                // specifying height, with default color and radius
                Cylinder c2 = new Cylinder(10.0);
                System.out.println("Cylinder:"
                                + " radius=" + c2.getRadius()
                                + " height=" + c2.getHeight()
                                + " base area=" + c2.getArea()
                                + " volume=" + c2.getVolume());

                // Declare and allocate a new instance of cylinder
                // specifying radius and height, with default color
                Cylinder c3 = new Cylinder(2.0, 10.0);
                System.out.println("Cylinder:"
                                + " radius=" + c3.getRadius()
                                + " height=" + c3.getHeight()
                                + " base area=" + c3.getArea()
                                + " volume=" + c3.getVolume());

                // Testing the toString() method
                System.out.println(c1.toString());

                // ** Test Shape class ** //
                // Declare and allocate a new instance of shape
                // with default color and filled
                models.Shape s1 = new models.Shape();
                System.out.println(s1.toString());

                // Declare and allocate a new instance of shape
                // with specified color and filled
                models.Shape s2 = new models.Shape("blue", false);
                System.out.println(s2.toString());

        }
}
