/*
Question 50: Write a Java program to check whether the absolute difference between two numbers is greater than 10.
Input:
m = 25
n = 12

Output:
Difference is greater than 10

Explanation:
Absolute difference = |25 ? 12| = 13.
Since 13 is greater than 10, the condition is true.
*/

import java.util.*;
class Difference
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		
		int m = xyz.nextInt();
		int n = xyz.nextInt();
		int d = m-n;
		
		System.out.println(d>10?"condition is true":"conditionis false");
	}
}