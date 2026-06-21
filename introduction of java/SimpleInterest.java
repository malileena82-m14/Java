/*
Question 12: Write a Java program to calculate simple interest.
Input:
Principal = 1000
Rate = 5
Time = 2

Output:
Simple Interest = 100

Explanation:
Simple Interest formula:
SI = (Principal × Rate × Time) / 100
Applying the formula gives 100.
*/

import java.util.*;
class SimpleInterest
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Principal,Rate,Time");
		
		int P = xyz.nextInt();
		int R = xyz.nextInt();
		int T = xyz.nextInt();
		
		System.out.println("Simple Interest ="+ ((P*R*T)/100));
		
		
	}
}