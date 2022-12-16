/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacee;

import java.util.Scanner;

/**
 *
 * @author Mostafa Helal
 */
public class Cartoon extends Book{
    String item;
    public Cartoon() {
    }

    public void setItem(String item) {
        this.item = item;
    }
    
    @Override
    public void displayably(int [] arr , String item)
    {
        double sum = 0.0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i];
        }
        System.out.println("THE SUM OF PRODUCT IS : "+sum);
        System.out.println("The Item IS : " + this.item );
    }
    
}
