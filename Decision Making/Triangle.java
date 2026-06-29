/*
Question 2: Write a Java program to check whether a triangle is valid or not.
Input:
A = 5, B = 6, C = 7

Output:
Valid Triangle

Explanation:
A triangle is valid if the sum of any two sides is greater than the third side.
*/

import java.util.*;
class Triangle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the three side of triangle");
		
		int A = xyz.nextInt();
		int B = xyz.nextInt();
		int C = xyz.nextInt();
		
		if(A+B>C && B+C>A && A+C>B)
		{
			System.out.println("Triangle is Valid");
		}
		
		else
		{
			System.out.println("Triangle is invalid");
		}
		
	}
}