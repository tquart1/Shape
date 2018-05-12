/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape3d;

/**
 *
 * @author user
 */
public class CircularCone extends CircularShapeWithHeight {
    public CircularCone(){
        super();
    }
    public CircularCone(double radius, double height){
        super(radius,height);
    }
    public double getArea(){
        double r = getRadius();
        double h = getHeight();
        return Math.PI * r * Math.sqrt(r*r+h*h);
    }
        public double getVolume(){
            return getCrossSectionalArea() * getHeight()/3.0;
        }
        public String toString(){
            return "Volume: " + getVolume() + "Area: " + getArea();
        }
        public boolean equals(Object obj){
            if(obj instanceof CircularCone){
                CircularCone otherCircles = (CircularCone)obj;
                return super.getRadius() == otherCircles.getRadius() && super.getHeight() == otherCircles.getHeight();
            }else
                return false;
        }
    }
