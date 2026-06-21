/*
Question 9: Write a Java program to enter two angles of a triangle and find the third angle.
Input:
Angle1 = 50
Angle2 = 60

Output:
Third Angle = 70

Explanation:
The sum of all angles in a triangle is 180°.
Third Angle = 180 ? (Angle1 + Angle2).
*/

import java.util.*;
class Triangle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter two angles of Triangle");
		
		int A1 = xyz.nextInt();
		int A2 = xyz.nextInt();
		
		
		System.out.println("Third angle ="+(180-(A1+A2)));
		
	}
}