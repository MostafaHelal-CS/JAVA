package com.mycompany.area_and_primeter;
/**
 *
 * @author Mostafa Helal
 */
import java.util.Scanner;
public class Area_and_primeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        circle c = new circle();
        double rad;
        System.out.println("ENTER THE RADUIS OF CIRCLE : ");
        rad = input.nextDouble();
        c.setraduis(rad);
        c.getarea();
        c.getdiameter();
        triangle t = new triangle();
        double x , y , z;
        System.out.println("ENTER THE SIDES OF TRIANGLE : ");
        x = input.nextDouble(); y = input.nextDouble(); z = input.nextDouble();
        t.set_sides(x, y, z);
        t.getarea();
        t.area();
        t.getdiameter();
       
    }
}
