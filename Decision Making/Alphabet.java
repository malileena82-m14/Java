/*
Question 6: Write a Java program to check whether a character is alphabetic or not.
Input:
Character = A

Output:
Alphabet

Explanation:
If character lies between A–Z or a–z.
*/

import java.util.*;
class Alphabet
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the character");
		
		char ch = xyz.nextLine().charAt(0);
		
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			System.out.println("number is Alphabetic");
		}
		else
		{
			System.out.println("number is not Alphabetic");
		}
		
	}
}