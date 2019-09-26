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
public class Exercise_51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("red",true);
        System.out.println(shape1.getColor() +" " +shape1.isFilled()+ " "+ shape1.toString());
        System.out.println(shape2.getColor() +" " +shape2.isFilled()+ " "+ shape2.toString());
        Circle C1 = new Circle();
        Rectangle R1 = new Rectangle();
        Square S1 = new Square();
        System.out.println(C1.getArea() +" " +C1.getPerimeter()+ " "+C1.getRadius() +" "+ C1.toString());
        System.out.println(R1.getArea() +" " +R1.getPerimeter()+ " "+R1.getLength() +" "+R1.getWidth()+" "+ R1.toString());
        System.out.println(S1.getArea() +" " +S1.getPerimeter()+ " "+S1.getLength() +" "+S1.getWidth()+" "+ S1.toString());
    }
    
}
