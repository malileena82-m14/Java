/*
Question 1: Write a Java program to check whether a number is even or odd.
Input:
Number = 8

Output:
Even

Explanation:
If a number is divisible by 2, it is Even. Otherwise, it is Odd.
*/

import java.util.*;
class EvenOdd
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = xyz.nextInt();
		
		if(num%2==0)
		{
			System.out.println("number is even ");
		}
		else
		{
			System.out.println("number is odd");
		}	

	}
}