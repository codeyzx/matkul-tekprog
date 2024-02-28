package models;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double newSide) {
        setWidth(newSide);
        setLength(newSide);
    }

    public void setWidth(double newWidth) {
        setSide(newWidth);
    }

    public void setLength(double newLength) {
        setSide(newLength);
    }

    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }

    // • Do you need to override the getArea() and getPerimeter()? Try them out.
    // Tidak perlu, karena sudah di override di class Rectangle dan Rumusnya sama
}
