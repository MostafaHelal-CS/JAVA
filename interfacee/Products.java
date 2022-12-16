package com.mycompany.interfacee;
/**
 *
 * @author Mostafa Helal
 */
public interface Products {
    public void setProd_name(String prod_name);
    public void setProd_code(int prod_code);
    public void setPrice(double price);
    public double getPrice();
    public void display();
    public abstract void Array_of_product(int []arr , String item);
    
    public abstract void displayably(int [] arr , String item);
}
