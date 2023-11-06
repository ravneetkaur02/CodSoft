/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ravne
 */
import java.util.Scanner;
class BankAccount {
    int bal=1000,amount=0;
     public int Bank(){
         return bal;
     }
        public void checkBalance(){
            System.out.println("Balance:"+bal);
        }
            public void deposit(int amount){
            bal=amount+bal;
            }
            public void withdraw(int amount){
               bal=bal-amount;
            }
}
class   Codsoft_Task3 extends BankAccount{
    public static void main(String[] args){
        int ch=0;
        Scanner sc=new Scanner( System.in);
        Codsoft_Task3 ob=new Codsoft_Task3();
            while(true)
            {
            System.out.println("1.CHECK BALANCE");
            System.out.println("2.DEPOSIT");
            System.out.println("3.WITHDRAW");
            System.out.println("4.EXIT");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                   ob.checkBalance();
                    break;
                 case 2:
                     System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
                     int a=sc.nextInt();
                    ob.deposit(a);
                    System.out.println("DEPOSITED SUCESSFULLY");
                    break;
                 case 3:
                    System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW");
                     a=sc.nextInt();
                     if(ob.Bank()-1000>=a)
                     {
                    ob.withdraw(a);
                    System.out.println("WITHDRAWN SUCESSFULLY");
                     }
                      else
                    System.out.println("Insufficient Balance");
                    break;
                 case 4:
                     System.exit(0);
            default:
            System.out.println("WRONG CHOICE! ENTER AGAIN");
            break;
            } 
    }
    }
}