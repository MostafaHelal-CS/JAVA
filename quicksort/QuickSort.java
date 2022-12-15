package com.mycompany.quicksort;
/**
 *
 * @author Mostafa Helal
 */
import java.util.Scanner;
public class QuickSort {

    public static int partition(int []arr , int low , int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low ; j < high ; j ++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i+1);
    }
    public static void quicksort(int []arr , int low , int high)
    {
        if(low < high)
        {
            int pov = partition(arr , low , high);
            quicksort(arr , low , pov-1);
            quicksort(arr , pov+1 , high);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("ENTER THE SIZE OF ARRAY : ");
        size = input.nextInt();
        int [] a = new int[size];
        for(int i = 0 ; i < size ; i ++)
        {
            System.out.println("ENTER THE ELEMENT OF ARRAY NO : "+(i+1));
            a[i] = input.nextInt();
        }
        System.out.println("UNSORTED ARRAY IS : ");
        for(int i = 0 ; i < size ; i ++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.print("SORTED ARRAY IS : ");
        quicksort(a , 0 , size -1);
        for(int i = 0 ; i < size ; i ++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        quicksort(a , size + 1 , 0);
        for(int i = 0 ; i < size ; i ++)
        {
            System.out.print(a[i]);
        }
    }
}
