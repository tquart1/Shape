/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape3d;

/**
 *
 * @author tquart1
 */
public class RectangularPrism implements Shape3D {

    private double length;
    private double height;
    private double width;

    public RectangularPrism() {
        height = 0.0;
        length = 0.0;
        width = 0.0;
    }

    public RectangularPrism(double l, double w, double h) {
        length = 1;
        width = w;
        height = h;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return 2 * (length * width + width * height + length * height);
    }

    public double getVolume() {
        return length * width * height;
    }

    public String toString() {
        return "Length: " + length + "Width: " + width + "Height: " + height;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cube) {
            RectangularPrism otherPrism = (RectangularPrism) obj;
            return length == otherPrism.getLength() && width == otherPrism.getWidth() && height == otherPrism.height;
        } else {
            return false;
        }
    }
}
