package com.mycompany.inheritance_model;
/**
 *
 * @author Mostafa Helal
 */

public class Inheritance_Model {

    public static void main(String[] args) {
        Vehicle v = new Vehicle("TESLA" , "Black" , 2022);
        Car c = new Car("TESLA" , "Black" , 2022 , "malaky");
        v.display();
        c.display();
    }
}
