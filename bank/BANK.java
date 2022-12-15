package com.mycompany.bank;

/**
 *
 * @author Mostafa Helal
 */
import java.util.Scanner;
import java.lang.String;
public class BANK {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyBankAccount b = new MyBankAccount();
        System.out.println("Welcome To Cario Bank");
        System.out.println("-----------HELLO------------");
        String name;
        System.out.print("Enter Your Name : \n");
        name = input.nextLine();
        b.setAccount_name(name);
        System.out.println("-----------------------------");
        int id;
        System.out.print("Enter Your Id : \n");
        id = input.nextInt();
        b.setAccount_Num(id);
        System.out.println("-----------------------------");
        double bal;
        System.out.print("Enter Your Balance : \n");
        bal = input.nextDouble();
        b.setBalance(bal);
        System.out.println("-----------------------------");
        System.out.println("Enetr The Operation That you Need : ");
        System.out.println("-----------------------------");
        System.out.println("1--> DEPOSIT ");
        System.out.println("2--> WITHDRAW ");
        System.out.println("3--> CHECK ");
        System.out.println("4--> DISPALY ");
        System.out.println("-----------------------------");
        int option;
        option = input.nextInt();
        switch(option)
        {
            case 1 -> {
                System.out.println("Eneter Your Amount : ");
                double Damo = input.nextDouble();
                b.deposit(Damo);
            }
            case 2 -> {
                System.out.println("Enter Your Amount : ");
                double Wamo = input.nextDouble();
                b.withdraw(Wamo);
            }
            case 3 -> b.CheckBalance();
            case 4 -> b.display();
        }  
    }
}
