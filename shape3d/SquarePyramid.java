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

public class SquarePyramid implements Shape3D {
    private double length;
    private double height;
    public SquarePyramid(){
        length = 0;
        height = 0;
    }
    public SquarePyramid(double l, double h){
        length = l;
        height = h;
    }
    public double getLength(){
        return length;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        return length * (length + Math.sqrt(length * length + 4 * height * height));
    }
    public double getVolume(){
        return length * length * height / 3.0;
    }
    public String toString() {
        return "SquarePyramid{" + "length=" + length + ", height=" + height + '}';
    }
    public boolean equals (Object obj){
        if(obj != null && obj instanceof SquarePyramid){
       SquarePyramid other = (SquarePyramid)obj;
        return length == other.length && height == other.height;
    }else
            return false;
    }
    
}
  

