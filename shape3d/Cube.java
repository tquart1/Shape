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
public class Cube extends RectangularPrism {
    public Cube(){
        super();
    }
    public Cube(double size){
        super(size,size,size);
    }
    public String toString(){
        return "Size of the Cube is" + super.getLength()+ "x" + super.getWidth() + "x" + super.getHeight()+
            "Area: " + super.getArea();
    }
    public double getArea(){
        return super.getArea();
    }
    public double getVolume(){
        return super.getVolume();
    }
    public boolean equals(Object obj){
          if (obj instanceof Shape3D){
            Cube other = (Cube)obj;
            return super.getLength()== other.getLength() && super.getWidth() == other.getWidth()&& super.getHeight() == other.getHeight();
            
        }else
            return false;
    }
    }
    


