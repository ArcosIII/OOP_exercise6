/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise_5.pkg1;

/**
 *
 * @author cabarronos_cis21035
 */
public class Square extends Rectangle {
   
    public Square(){
       super();
    }
    public Square(double side){
       super(side,side);
    }
    public Square(double side,String color,boolean filled){
       super(side,side,color,filled);
    }
    public double getSide(){
        return this.getLength();
    }
    public void setLength(double side){
        super.setWidth(side);
        super.setlength(side);
    }
    public void setWidth(double side){
        super.setWidth(side);
        super.setlength(side);
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setlength(side);
    }
    public String toString(){
        return "A Square with side " + this.getLength()+" which is a subclass of "+super.toString();
    }
}
