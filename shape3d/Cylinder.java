/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape3d;

public class Cylinder extends CircularShapeWithHeight {
    public Cylinder(){
        super();
    }
    public Cylinder(double radius, double height){
        super(radius,height);
    }
    public boolean equals(Object obj){
        if (obj instanceof Shape3D){
            Cylinder other = (Cylinder)obj;
            return super.getRadius() == other.getRadius() && super.getHeight() == other.getHeight();
            
        }else
            return false;
    }
    public String toString(){
        return " Radius" + super.getRadius() + "Height: " + super.getHeight() + "Volume: " +super.getVolume() + "Area: " + super.getArea();
    }
    public double getArea(){
        return super.getArea();
    }
    public double getVolume(){
          return Math.PI * Math.pow(super.getRadius(), 2) * super.getHeight();
        }

    }

