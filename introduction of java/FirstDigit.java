/*
Question 23: Write a Java program to calculate the sum of the first and last digit without using a loop.
Input:
123

Output:
4

Explanation:
First digit = 1
Last digit = 3
Sum = 1 + 3 = 4.
*/

import java.util.*;
class FirstDigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int n = xyz.nextInt();
		int first,last,sum;
		
		first = n/100;
		last = n%10;
		sum = first + last;
		
		System.out.println("Sum of First and Last Digit = " + sum);
		
	}
}