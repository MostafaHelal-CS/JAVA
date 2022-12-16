package com.mycompany.inheritance_model;
/**
 *
 * @author Mostafa Helal
 */
public class Car extends Vehicle {
    private String body;

    public Car() {
    }

    public Car(String Make , String color, int year , String body) {
        super(Make, color, year);
        this.body = body;
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Style Body Is : " + this.body );
    }
            
    
    
}
