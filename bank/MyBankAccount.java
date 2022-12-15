package com.mycompany.bank;

/**
 *
 * @author Mostafa Helal
 */
public class MyBankAccount {
    private String account_name;
    private int account_Num;
    private double balance;

    public MyBankAccount() {
    }

    public MyBankAccount(String account_name, int account_Num, double balance) {
        this.account_name = account_name;
        this.account_Num = account_Num;
        this.balance = balance;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public void setAccount_Num(int account_Num) {
        this.account_Num = account_Num;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount)
    {
        if(amount < 0)
        {
            System.out.println("Amount Should Be Positive");
        }else{
            balance += amount;
            System.out.println("The Balance : " + balance);
        }
        
    } 
    
    public void withdraw(double amount)
    {
        if(amount < 0)
        {
            System.out.println("Amount Should Be Positive");
        }else{
            if(balance < amount){
                System.out.println("Insufficient Balance");
            }else{
                balance -= amount;
                System.out.println("The Balance : " + balance);
            }
        }
    }
    
    public void CheckBalance()
    {
        System.out.println("THE BALANCE IS : "+ this.balance);
    }
    public void display()
    {
        System.out.println("Account Name : "+ this.account_name + "Account-Num : "+ this.account_Num + "Your Balance Is : "+ this.balance );
    }
}
