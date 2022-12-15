package com.mycompany.myonlineshop;

/**
 *
 * @author Mostafa Helal
 */
public class ChilderenBook extends Book {
    protected int no_of_book_part;

    public ChilderenBook( String prod_name, int prod_code, double price, String author, String Book_Typr, String publish_date,int no_of_book_part) {
        super(prod_name, prod_code, price, author, Book_Typr, publish_date);
        this.no_of_book_part = no_of_book_part;
    }

   

    public ChilderenBook() {
    }

    public void setNo_of_book_part(int no_of_book_part) {
        this.no_of_book_part = no_of_book_part;
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.println("No Of Parts Of Book Is : " + this.no_of_book_part );
    }
}
