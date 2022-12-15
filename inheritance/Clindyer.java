package com.mycompany.inheritance;

/**
 *
 * @author Mostafa Helal
 */
public class Clindyer extends Circle {
    double height;
    
    public Clindyer() {
    }
    public Clindyer(double radius , double height) {
        super(radius);
        this.height = height;
    }

    public void setside(double radius , double height)
    {
        this.radius = radius;
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public double getArea()
    {
        return(super.getArea()+( 2*3.14*height));
    }
}
