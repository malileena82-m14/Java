/*
Question 25: Write a Java program to check whether a number is palindrome or not.
Input:
121

Output:
Palindrome

Explanation:
A palindrome number remains the same when reversed.
Since 121 reversed is also 121, it is a palindrome.
*/

import java.util.*;
class Palindrome
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int n = xyz.nextInt();
		int p = (n%10)*100 + ((n/10)%10)*10 + (n/100);
		
		System.out.println( n==p? "palindrome": "not palindrome");
		
	}
}