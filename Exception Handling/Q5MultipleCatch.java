/*Question 5: Write a Java program to demonstrate multiple catch blocks.
Accept two numbers and perform division and also store the result in an array. Handle both ArithmeticException and 
ArrayIndexOutOfBoundsException separately.
Asked In Practice Assignment
Input:
Enter number1: 20
Enter number2: 0

Output:
Arithmetic Exception handled

Explanation:
Multiple catch blocks allow handling different exception types differently. First catch block handles ArithmeticException 
for division by zero. Second catch block handles ArrayIndexOutOfBoundsException for invalid array access. 
Each block provides specific error handling for its exception type.*/

import java.util.*;
class Q5MultipleCatch
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = xyz.nextInt();
		
		System.out.println("Enter number2");
		int num2 = xyz.nextInt();
		
		try
		{
			int d = num1/num2;
			System.out.println(d);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException ex1)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
	}
}