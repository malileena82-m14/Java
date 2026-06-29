/*
Question 22: Write a Java program to find the first and last digit of a three-digit number without using a loop.
Input:
456

Output:
First = 4
Last = 6

Explanation:
The first digit is obtained by dividing the number by 100.
The last digit is obtained using the modulus operator (% 10).
*/

import java.util.*;
class ThreeDigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int n = xyz.nextInt();
		
		System.out.println("First = " + (n/100));
		System.out.println("Last  = " + (n%10));
	}

}