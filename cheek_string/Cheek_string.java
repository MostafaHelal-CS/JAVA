package com.mycompany.cheek_string;
/**
 *
 * @author Mostafa Helal
 */
import java.util.Scanner;
public class Cheek_string {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str ;
        System.out.println("ENTER THE VALUE OF STRING");
        str = input.nextLine();
        for(int i = 0 ; i < str.length() ; i ++)
        {
            if(str.charAt(i) == ',')
            {
             i += 1;
            }
            System.out.print(str.charAt(i));
        }
    }
}
