/*
Question 24: Write a Java program to check whether a number is a Neon number or not.
Input:
9

Output:
Neon Number

Explanation:
A Neon number is a number where the sum of digits of its square is equal to the number itself.
9² = 81 ? 8 + 1 = 9.
*/

import java.util.*;
class NeonNumber
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int n = xyz.nextInt();
		int sq = n*n;
		int sum = (sq/10) + (sq%10);
		
		System.out.println(sum == n? "Neon number" : "not neon number");
		
	}
}
		