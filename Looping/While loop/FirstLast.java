/*Question 18: Write a java program to find the first and last digit of a number.
Input:

Number = 1234

Output:

First Digit = 1
Last Digit = 4

Explanation:

Last digit is found using number % 10.
First digit is found by dividing the number until it becomes a single digit.*/
import java.util.*;
class FirstLast
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = xyz.nextInt();
		int last = num%10;
		int first = num;
		
		while(first>=10)
		{
			first= first/10;
		}
		System.out.println("First = "+first);
		System.out.println("Last  = "+last);
	}
}