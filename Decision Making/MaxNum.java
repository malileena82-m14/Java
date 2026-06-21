/*
Question 17: Write a java program to find the maximum between two numbers.
Input:
Number1 = 45
Number2 = 30

Output
Maximum number = 45

Explanation:
If Number1 > Number2, print Number1.
Otherwise, print Number2.
*/
import java.util.*;
class MaxNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		
		int num1 = xyz.nextInt();
		int num2 = xyz.nextInt();
		
		if(num1>num2)
		{
			System.out.println("Maximum Number = "+ num1);
		}
		else
		{
			System.out.println("Maximum Number = "+ num2);
		}
	}
}