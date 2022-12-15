package com.mycompany.inheritance;
/**
 *
 * @author Mostafa Helal
 */
public class Circle {
    protected double radius;

    public Circle() {
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public double getArea()
    {
        return(3.14*radius*radius);
    }
    
            
}
