/*Question 26: Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the 
number is equal to the number.
Input:

Number = 9

Output:

Neon Number

Explanation:

9² = 81
8 + 1 = 9
Since the sum equals the number, it is a Neon Number.*/

import java.util.*;
class NeonNumber
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		int temp = n;
		int sq = n*n;
		int sum = 0;
		
		while(sq>0)
		{
			int digit = sq%10;
			sum = sum + digit;
			sq = sq /10;
		}
		if(n==sum)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not Neon Number");
		}
	}
}