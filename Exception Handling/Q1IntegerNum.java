/*Question 1: Write a Java program to handle ArithmeticException when a number is divided by zero.

Accept two integer numbers from the user and perform division. If the denominator is zero, handle the exception and display 
a proper message instead of terminating the program.
Asked In Practice Assignment
Input:
Enter first number: 10
Enter second number: 0

Output:
Exception occurred: Cannot divide by zero

Explanation:
ArithmeticException is thrown when dividing by zero. Use try-catch block to catch this exception. In the catch block, 
display an error message explaining that division by zero is not allowed. This prevents the program from crashing and allows 
graceful error handling*/

import java.util.*;
class Q1IntegerNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = xyz.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = xyz.nextInt();
		
		try
		{
			int d = num1/num2;
			System.out.println("Answer: "+d);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception occurred: Cannot divide by zero");
		}
		
	}
}