package com.mycompany.myonlineshop;

/**
 *
 * @author Mostafa Helal
 */
public abstract class Product {
    protected String prod_name;
    protected int prod_code;
    protected double price;

    public Product() {
    }

    public Product(String prod_name, int prod_code, double price) {
        this.prod_name = prod_name;
        this.prod_code = prod_code;
        this.price = price;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public void setProd_code(int prod_code) {
        this.prod_code = prod_code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    public void display()
    {
        System.out.println("Product Name Is : " + this.prod_name + " Product Code Is : " + this.prod_code + " Price Is : " + this.price );
    }
    public abstract void Array_of_product(int []arr);
    
    public abstract void displayably(int [] arr);
    
}

