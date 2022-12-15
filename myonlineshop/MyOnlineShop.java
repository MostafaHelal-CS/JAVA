package com.mycompany.myonlineshop;

/**
 *
 * @author Mostafa Helal
 */
import java.util.Scanner;
public class MyOnlineShop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book b = new Book();
        ChilderenBook cb = new ChilderenBook();
        
        String p_name;
        System.out.println("ENTER THE PRODUCT NAME : ");
        p_name = input.nextLine();
        b.setProd_name(p_name);
        System.out.println("-----------------------------");
        
        int p_code;
        System.out.println("ENTER THE PRODUCT CODE : ");
        p_code = input.nextInt();
        b.setProd_code(p_code);
        System.out.println("-----------------------------");
        
        double pris;
        System.out.println("ENTER THE PRICE OF PRODUCT : ");
        pris = input.nextDouble();
        b.setPrice(pris);
        System.out.println("-----------------------------");
        String aut;
        System.out.println("ENTER THE AUTHOR NAME : ");
        aut = input.nextLine();
        b.setAuthor(aut);
        System.out.println("-----------------------------");
        String p_type;
        System.out.println("ENTER THE BOOK TYPE : ");
        p_type = input.nextLine();
        b.setBook_Typr(p_type);
        System.out.println("-----------------------------");
        
        String p_date;
        System.out.println("ENTER THE PUBLISH DATE : ");
        p_date = input.nextLine();
        b.setPublish_date(p_date);
        System.out.println("-----------------------------");
        
        int No_Parts;
        System.out.println("ENTER THE NUMBER OF PARTS : ");
        No_Parts = input.nextInt();
        cb.setNo_of_book_part(No_Parts);
        System.out.println("-----------------------------");
        //--------------------------array--------------------
        int size;
        System.out.println("ENTER THE NUMBER OF PRODUCTS : ");
        size = input.nextInt();
        int [] arra = new int[size];
        b.Array_of_product(arra);
        System.out.println("-----------------------------");
        
        b.displayably(arra);
        System.out.println("-----------------------------");
        
        b.display();
        
    }
}
