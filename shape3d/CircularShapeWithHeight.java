/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape3d;

public abstract class CircularShapeWithHeight extends CircularShape {
    private double height;
    public CircularShapeWithHeight(){
        super();
    }
    public CircularShapeWithHeight(double radius, double h){
        super(radius);
        height = h;
    }
    public double getHeight(){
        return height;
    }
   public double getCrossSectionalArea(){
      return super.getCrossSectionArea();
   }
   public double getVolume(){
       return super.getVolume();
   }
   public double getArea(){
       return super.getArea();
   }
   
   public String toString(){
       return "Cross Sectional Area: " + getCrossSectionalArea() + "Height: " + getHeight();
   }
   public boolean equals(Object obj){
       if(obj instanceof CircularShapeWithHeight){
           CircularShapeWithHeight other =(CircularShapeWithHeight)obj;
           return height == other.height && super.getRadius()==other.getRadius();
       }else
           return false;
   }
   }

