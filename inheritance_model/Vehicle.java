package com.mycompany.inheritance_model;
/**
 *
 * @author Mostafa Helal
 */
public class Vehicle {
    private String Make;
    private String color;
    private int year;

    public Vehicle() {
    }

    public Vehicle(String Make, String color, int year) {
        this.Make = Make;
        this.color = color;
        this.year = year;
    }

    public void setVeh_Name(String Make) {
        this.Make = Make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display()
    {
        System.out.println("Vehicle Name Is : " + this.Make + " Vehicle Color Is : " + this.color + " Year : " + this.year );
    }
    
}
