/*
Question 3: Write a Java program to check whether a triangle is equilateral, isosceles or scalene.
Input:
A = 5, B = 5, C = 5

Output:
Equilateral

Explanation:
All sides equal ? Equilateral
Two sides equal ? Isosceles
All sides different ? Scalene
*/

import java.util.*;
class ThreeTriangle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Triangle side");
		
		int A = xyz.nextInt();
		int B = xyz.nextInt();
		int C = xyz.nextInt();
		
		if(A==B && B==C && A==C)
		{
			System.out.println("Triangle is Equilateral");
		}
		
		else if(A==B || B==C || A==C)
		{
			System.out.println("Triangle is Isosceles");
		}
		else
		{
			System.out.println("Triangle is Scalene");
		}
		
	}
}