/*
Question 32: Write a Java program to check whether a triangle is valid or not using its three angles.
Input:
Angle1 = 60
Angle2 = 60
Angle3 = 60

Output:
Valid Triangle

Explanation:
A triangle is valid only if the sum of all three angles is exactly 180°.
60 + 60 + 60 = 180, so it is valid.
*/

import java.util.*;
class SumTriangle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int A1 = xyz.nextInt();
		int A2 = xyz.nextInt();
		int A3 = xyz.nextInt();
		
		System.out.println(A1+A2+A3==180? "valid triangle" : "invalid triangle");
		
	}
}