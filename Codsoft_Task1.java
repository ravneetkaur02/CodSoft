/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ravne
 */
import java.util.Random;
import java.util.Scanner;
public class Codsoft_Task1{
    public static void main(String args[])
    {
        int c=0,i,p=1;
        // create instance of Random class
        Random rand = new Random();
        Scanner sc=new Scanner(System.in);
        // Generate random integers in range 1 to 100
        int no = rand.nextInt(100);
        System.out.println(no);
        i=0;
        while(i<=9)
        {
        System.out.println("Enter an integer number for your guess for generated no.");
        int g=sc.nextInt();
        if(no>g)
        System.out.println("Your Guess Is Too Low");
        else if(no<g)
        System.out.println("Your Guess Is Too High");
        else{
        c++;
        break;
         }
        i++;
        p++;
        }
        System.out.println("YOUR SCORE="+c+"/"+p);
}
}
