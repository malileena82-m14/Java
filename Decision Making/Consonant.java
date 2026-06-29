/*Question 56: Write a program to input a character and check whether it is a vowel or consonant using a switch case.
Input:
Character = a

Output:
Vowel

Explanation:
The switch checks for 'a', 'e', 'i', 'o', 'u'. Since 'a' matches, it prints Vowel.

Input:
Character = k

Output:
Consonant

Explanation:
Since 'k' does not match any vowel case, default executes and prints Consonant.*/
import java.util.*;
class Consonant
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Character");
		
		char ch = xyz.nextLine().charAt(0);
		
		if(ch>=65 && ch<=90)
			{
				ch=(char)((int)ch+32);
			}
		
		switch(ch)
		{
			case 'a': System.out.println("Vowel");
			break;
			case 'e': System.out.println("Vowel");
			break;
			case 'i': System.out.println("Vowel");
			break;
			case 'o': System.out.println("Vowel");
			break;
			case 'u': System.out.println("Vowel");
			break;
			default:System.out.println("Consonant");
			break;
		}
	}
}