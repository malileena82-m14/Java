/*
Question 10: Write a java program to input any character and check whether it is alphabet, digit or special character.
Input:
Character = 5

Output:
Digit

Explanation:
Check ASCII ranges.
*/
import java.util.*;
class Character
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Character");
		
		char ch = xyz.nextLine().charAt(0);
		
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			System.out.println("it is alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("it is Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
	
	}
}
