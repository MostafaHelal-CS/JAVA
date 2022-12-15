package com.mycompany.max_array;
/**
 *
 * @author Mostafa Helal
 */
import java.util.Scanner;
public class Max_Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("ENTER THE SIZE OF ARRAY");
        size = input.nextInt();
        int [] arr = new int[size];
        for(int i = 0 ; i < size ; i ++)
        {
            System.out.println("ENTER THE VALUE OF : "+(i+1));
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for(int i = 0 ; i < size  ; i ++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("THE MAXIMUM NUMBER OF THE ARRAY IS = "+max);
    }
}
