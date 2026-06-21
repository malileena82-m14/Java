/*Question 29: Write a Java program to find quotient and remainder using arithmetic operators.
Input:
Dividend = 20
Divisor = 3

Output:
Quotient = 6
Remainder = 2

Explanation:
The division operator (/) gives the quotient.
The modulus operator (%) gives the remainder.
*/

import java.util.*;
class Remainder
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int Dividend =xyz.nextInt();
		int Divisor = xyz.nextInt();
		
		System.out.println("quotient = "+ Dividend/Divisor );
		System.out.println("remainder = " + Dividend%Divisor );
	}
}