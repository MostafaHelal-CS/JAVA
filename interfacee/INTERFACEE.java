package com.mycompany.interfacee;
/**
 *
 * @author Mostafa Helal
 */
import java.util.Scanner;
public class INTERFACEE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book b = new Book("C++" , 300 , 150.0);
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
        
        String itm;
        System.out.println("ENTER THE Item Of Cartoon : ");
        itm = input.nextLine();
        System.out.println("-----------------------------");
        
        int size;
        System.out.println("ENTER THE NUMBER OF PRODUCTS : ");
        size = input.nextInt();
        int [] arra = new int[size];
        b.Array_of_product(arra, itm);
        System.out.println("-----------------------------");
        
        b.displayably(arra, itm);
        System.out.println("-----------------------------");
        
        b.display();
    }
}
