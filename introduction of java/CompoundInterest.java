/*
Question 13: Write a Java program to calculate compound interest.
Input:
Principal = 2000
Rate = 10
Time = 2

Output:
Compound Interest = 420

Explanation:
Compound Interest is calculated using the formula:
CI = P(1 + R/100)^T ? P
After calculation, the compound interest is 420.
*/

import java.util.*;
class CompoundInterest
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter principal,rate,Time");
		
		int P = xyz.nextInt();
		int r = xyz.nextInt();
		int T = xyz.nextInt();
		
        double amount  = P * Math.pow(1 + r / 100.0, T);	
		double compound = amount - P;
		System.out.println("Calculate compound Interest = "+compound);
	}
}