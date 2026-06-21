/*
Question 10: Write a Java program to calculate the area of an equilateral triangle.
Input : Side = 6
Output : Area = 15.59
Explanation : Area is calculated using the formula for equilateral triangles.
*/

import java.util.*;
class Equilateral
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter side of triangle");
		
		float S = xyz.nextFloat();
		
		System.out.println("Area of Triangle ="+ (Math.sqrt (3)/4) *(S*S));
	}
}