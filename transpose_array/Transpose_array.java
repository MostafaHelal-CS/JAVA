package com.mycompany.transpose_array;
/**
 *
 * @author Mostafa Helal
 */
import java.util.Scanner;
public class Transpose_array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row , col;
        System.out.println("ENTER THE VALUE OR ROW , COL");
        row = input.nextInt();
        col = input.nextInt();
        int [][] arr = new int[row][col];
        for(int i = 0 ; i < row ; i ++)
        {
            for(int j = 0 ; j < col ; j ++)
            {
                System.out.println("ENTER THE VALUE OF : "+i +","+ j);
                arr[i][j] = input.nextInt();
            }
        }
        for(int i = 0 ; i < row ; i ++)
        {
            for(int j = 0 ; j < col ; j ++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("*****************");
        for(int i = 0 ; i < col ; i ++)
        {
            for(int j = 0 ; j < row ; j ++)
            {
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
