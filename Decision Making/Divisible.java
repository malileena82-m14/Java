/*
Question 5: Write a Java program to check whether a number is divisible by 5 and 11 or not.
Input:
Number = 55

Output:
Divisible by 5 and 11

Explanation:
If number % 5 == 0 AND number % 11 == 0.
*/
import java.util.*;
class Divisible
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		
		if(n%5==0 && n%11==0)
		{
			System.out.println("Divisible by 5 and 11");
		}
		else
		{
		System.out.println("Not");
		}
	}
}