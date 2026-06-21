/*Question 14: Write a java program to check whether a number is palindrome or not.
Input:

Number = 121

Output:

Palindrome

Explanation:

The reversed number of 121 is also 121.
Since original and reversed numbers are equal, it is a palindrome.*/
import java.util.*;
class Palindrome
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = xyz.nextInt();
		int original=num;
		int rev = 0;
		
		while(num>0)
		{
			int digit = num%10;
			rev = rev*10+ digit;
			num = num/10;
		}	
		if(original==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}