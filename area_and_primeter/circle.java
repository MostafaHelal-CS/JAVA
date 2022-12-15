package com.mycompany.area_and_primeter;
/**
 *
 * @author Mostafa Helal
 */
public class circle {
    private double raduis;
    public void setraduis(double r)
    {
        raduis = r;
    }
    public double getraduis()
    {
        return raduis;
    }
    public void getarea()
    {
        System.out.println("The area of circle is : "+3.14*raduis*raduis);
    }
    public void getdiameter()
    {
       System.out.println("The primeter of circle is : "+2*3.14*raduis);
    }
}
