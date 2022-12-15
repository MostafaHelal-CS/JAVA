package com.mycompany.inheritance;
import java.util.Scanner;
public class Inheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rad , heigh;
        System.out.println("ENTER THE RADIUS");
        rad = input.nextDouble();
        System.out.println("ENTER THE HEIGHT");
        heigh = input.nextDouble();
        Circle c1 = new Circle();
        c1.setRadius(rad);
        System.out.println(c1.getArea());
        Clindyer cd1 = new Clindyer();
        cd1.setside(rad, heigh);
        System.out.println(cd1.getArea());
        System.out.println();
    }
}
