/*
Question 21: Write a Java program to reverse a number without using a loop.
Input:
123

Output:
321

Explanation:
Digits are separated using arithmetic operations and rearranged in reverse order without using loops.
*/

import java.util.*;
class Reverse
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int n  = xyz.nextInt();
		int rev = (n%10)*100 + ((n/10)%10)*10 + (n/100);
		
		System.out.println("Reverse Number =" + rev );
	}
}