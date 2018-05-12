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
public abstract class CircularShape implements Shape3D {
    private double radius;
    
 public CircularShape(){
     super();
     radius = 0.0;
 }
 public CircularShape(double r){
     radius = r;
 }
 public double getDiameter(){
     return radius * 2;
 }
 public double getRadius(){
     return radius;
 }
 public double getCrossSectionArea(){
     return Math.PI * Math.pow(radius, 2);
 }
 public double getCrossSectionPerimeter(){
     return 2 * Math.PI * radius;
 }
 public String toString(){
     return "Radius: " + radius;
 }
public boolean equals(Object obj){
    if(obj instanceof CircularShape){
        CircularShape otherCircle = (CircularShape)obj;
        return radius == otherCircle.radius && super.equals(obj);
    } else
        return false;
}
public double getArea(){
    return Math.PI * Math.pow(radius, 2);
}
public double getVolume(){
    return 2 * Math.PI * radius;
}
}

