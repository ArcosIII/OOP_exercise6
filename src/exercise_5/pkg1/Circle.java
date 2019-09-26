/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise_5.pkg1;
import java.lang.Math;
/**
 *
 * @author cabarronos_cis21035
 */
public class Circle extends Shape {
     private double radius;
     
    public Circle(){
         this.radius = 1.0;
     }
     public Circle(double radius){
         this.radius = radius;
     }
     public Circle(double radius,String color,boolean filled){
         this.radius = radius;
         this.setColor(color);
         this.setFilled(filled);
     }
     public double getRadius(){
         return radius;
     }
     public void setRadius(double radius){
         this.radius = radius;
     }
     public double getArea(){
         double area = (this.radius * this.radius) * Math.PI;
         return area;
     }
     public double getPerimeter(){
         double circ = (this.radius * 2) * Math.PI;
         return circ;
     }
     public String toString(){
         return " A Circle with radius " + this.radius + " which is a subclass of "+super.toString();
     }
}
