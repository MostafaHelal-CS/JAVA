package com.mycompany.area_and_primeter;
/**
 *
 * @author Mostafa Helal
 */
import java.lang.Math;
public class triangle {
    private double base;
    private double height;
    private double hypotenuse;
    public void set_sides(double b , double h , double hy)
    {
        base = b;
        height = h;
        hypotenuse = hy;
    }
    public void getarea()
    {
        double x = (base + height + hypotenuse)/2;
        System.out.println("THE AREA OF TRIANGLE IS : " +(Math.sqrt(x*(x-base)*(x-height)*(x-hypotenuse))));
    }
    public void area()
    {
        System.out.println("THE AREA OF TRIANGLE IS : "+(0.5*base*height));
    }
     public void getdiameter()
    {
         System.out.println("THE PRIMETER OF TRIANGLE IS : "+(base+height+hypotenuse));
    }
}
