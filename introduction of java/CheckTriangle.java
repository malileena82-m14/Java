/*
Question 33: Write a Java program to check whether a triangle is equilateral, isosceles, or scalene.
Input:
Side1 = 5
Side2 = 5
Side3 = 5

Output:
Equilateral Triangle

Explanation:
If all three sides are equal ? Equilateral.
If any two sides are equal ? Isosceles.
If all sides are different ? Scalene
*/
import java.util.*;
class CheckTriangle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		int c = xyz.nextInt();
		
		System.out.println((a==b && b==c)? "Equilateral" :(a==b || b==c || a==c)?"isosceles" : "scalene");
	}
}
		