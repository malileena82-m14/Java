/*Q9. Write a menu-driven program in java using switch case.  
1. Check Number is positive , negative or zero.  
2. Check Number is even or odd.  
3. Find max number using 3 number.*/

import java.util.*;
class Q9java
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		int choice = xyz.nextInt();
		int n1 ,n2;
		
		switch(choice)
		{
			case 1: 
			 n1 = xyz.nextInt();
			if(n1>0)
			{
				System.out.println("Positive");
			}
			else if(n1<0)
			{
				System.out.println("Negative");
			}
			else
			{
				System.out.println("Zero");
			}
			
			break;
			
			case 2: 
			 n1 = xyz.nextInt();
			if(n1%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
			break;	
			
			case 3:
			n1 = xyz.nextInt();
			n2 = xyz.nextInt();
			n3 = xyz.nextInt();
			
			if(n1>n2)
			{
				System.out.println("Maximum number = "+ n1);
			}
			else if(n1<n2 && n2<n3) 
			{
				System.out.println("Maximum Number = "+ n3);
			}
			else 
			{
				System.out.println("Maximum Number = "+ n2);
			}
			break;
		}
	}
}