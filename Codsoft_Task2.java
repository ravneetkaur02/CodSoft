/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ravne
 */
import java.util.Scanner;
class Codsoft_Task2
{
	public static void main(String[] args)
	{
            int i;
            double p=0.0,s=0.0,m=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The No of Subjects:");
                int no=sc.nextInt();
                for(i=1;i<=no;i++){
                   System.out.println("Enter The Marks of Subject"+i+" Out of 100:");
                    m=sc.nextDouble();
                    s=s+m;
                }
                p=(s*100)/(100*no);
		System.out.println("Total :"+(int)s+"/"+(100*no));
		System.out.println("Average Percentage :"+p+"%");	
		if(p>=90)
			System.out.println("Grade O");
		else if(p>=80 && p<=89)
			System.out.println("Grade A");
		else if(p>=70 && p<=79)
			System.out.println("Grade B");
		else if(p>=60 && p<=69)
			System.out.println("Grade C");
		else if(p>=50 && p<=59)
			System.out.println("Grade D");
                else if(p>=40 && p<=59)
		       System.out.println("Grade E");
                else
                    System.out.println("Grade F");
        }
}
