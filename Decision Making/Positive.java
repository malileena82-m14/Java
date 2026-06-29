/*
Question 4: Write a Java program to check whether a number is positive, negative or zero.
Input:
Number = -5

Output:
Negative

Explanation:
If number > 0 ? Positive
If number < 0 ? Negative
If number = 0 ? Zero
*/

import java.util.*;
class Positive
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = xyz.nextInt();
		
		if(num>0)
		{
			System.out.println("number is positive");
		}
		else if(num<0)
		{
			System.out.println("number is Negative");
		}
		else 
		{
			System.out.println("number is Zero");
		}
	}
}