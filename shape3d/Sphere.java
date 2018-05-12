/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape3d;

public class Sphere implements Shape3D {

    private double radius;
    private double x;

    public Sphere() {
        radius = 0.0;
    }

    public Sphere(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
    }

    public String toString() {
        return "Radius: " + radius + "X: " + x;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sphere) {
            Sphere other = (Sphere) obj;
            return radius == other.radius && x == other.x;
        } else {
            return false;
        }
    }
}
