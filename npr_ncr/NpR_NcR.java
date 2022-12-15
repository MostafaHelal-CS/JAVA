package com.mycompany.npr_ncr;
/**
 *
 * @author Mostafa Helal
 */
import java.util.Scanner;
public class NpR_NcR {
    public static int factorial( int num)
    {
        int fact = 1;
        for(int i = 1 ; i <= num ; i ++)
        {
            fact = fact *i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n , r ,NpR , NcR;
        System.out.println("ENTER THE VALUE OF n");
        n = input.nextInt();
        System.out.println("ENTER THE VALUE OF r");
        r = input.nextInt();
        NpR = (factorial(n)/factorial(n-r));
        System.out.println(NpR);
        NcR = (factorial(n)/(factorial(r)*factorial(n-r)));
        System.out.println(NcR);
    }
}
