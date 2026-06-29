/*
Question 20: Write a Java program to compute the sum of digits of an integer.
Input:
123

Output:
6

Explanation:
Each digit is separated using modulus and division operations.
1 + 2 + 3 = 6.
*/

import java.util.*;
class Digits
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter the Integer");
		
		int no = xyz.nextInt();
		int sum = 0;
		int rem = no%10;//3
		sum = sum + rem;//3
		no = no/10;//12
		rem = no%10;
		no = no/10;
		sum = sum + rem;
		
		
		System.out.println("Sum of Digits = " + sum );
	}
}