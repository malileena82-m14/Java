/*Question 22: Write a java program to check whether a number is palindrome or not.
Input:
Number = 121

Output
Palindrome Number

Explanation:
Reverse of 121 is 121.
Since original number equals reversed number, it is a Palindrome.*/
import java.util.*;
class Palindrome
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		int p = (n/100)*100+((n%100)/10)*10+(n/100);
		
		if(n==p)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("not Palindrome Number");
		}
	}
}