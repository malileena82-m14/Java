/*Question 63: Write a menu-driven program in java using switch case.
          1.Check Number is positive , negative or zero.
          2.Check Number is even or odd.
          3.Write a c program to find the max number using 2 numbers.
Input:
Choice = 1
Number = -5

Output:
Negative Number

Explanation:
Program checks if number is less than zero and prints Negative.

Input:
Choice = 3
Number1 = 10
Number2 = 20

Output:
Maximum Number = 20

Explanation:
Program compares two numbers and prints the greater one.*/
import java.util.*;
class Zero
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
			
			if(n1>n2)
			{
				System.out.println("Maximum Number = "+ n1);
			}
			else
			{
				System.out.println("Maximum Number = "+ n2);
			}
			break;
		}		
	}
}