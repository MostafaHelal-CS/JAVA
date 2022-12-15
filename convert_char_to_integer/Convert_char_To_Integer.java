package com.mycompany.convert_char_to_integer;
/**
 *
 * @author Mostafa Helal
 */
import java.util.Scanner;
public class Convert_char_To_Integer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("ENTER THE CHARACTER");
        ch = input.next().charAt(0);
        int x = (int)ch;
        System.out.println(x);
    }
}
