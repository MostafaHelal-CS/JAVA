package com.mycompany.myonlineshop;

import java.util.Scanner;

/**
 *
 * @author Mostafa Helal
 */
public class Book extends Product {
    protected String author;
    protected String Book_Typr;
    protected String publish_date;
    
    public Book() {
    }

    public Book( String prod_name, int prod_code, double price,String author, String Book_Typr, String publish_date) {
        super(prod_name, prod_code, price);
        this.author = author;
        this.Book_Typr = Book_Typr;
        this.publish_date = publish_date;
    }
    
   
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBook_Typr(String Book_Typr) {
        this.Book_Typr = Book_Typr;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }
    @Override
    public void Array_of_product(int []arr)
    {
        Scanner input = new Scanner(System.in);
        int len = arr.length;
        for(int i = 0 ; i < len ; i ++)
        {
            System.out.println("ENTER Product Price  No : " +(i+1) );
            arr[i] = input.nextInt();
        }
    }
    @Override
    public void displayably(int [] arr)
    {
        double sum = 0.0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i];
        }
        System.out.println("THE SUM OF PRODUCT IS : "+sum);
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Author Name Is : " + this.author + " Type Of Book Is : " + this.Book_Typr + " Publish Date : " + this.publish_date );
    }

    
    
    
}
