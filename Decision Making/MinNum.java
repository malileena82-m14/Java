/*
Question 16: Write a java program to find a minimum between three numbers.
Input:
Number1 = 9
Number2 = 4
Number3 = 7

Output
Minimum number = 4

Explanation:
Compare all three numbers using nested if-else statements to determine the smallest number.
*/
/*
import java.util.*;
class MinNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter three numbers");
		
		int num1 = xyz.nextInt();
		int num2 = xyz.nextInt();
		int num3 = xyz.nextInt();
		
		if(num1<num2 && num1<num3)
		{
			System.out.println("Num1 is Maximum = "+ num1);
		}
		else if(num2<num3)
		{
			System.out.println("Num2 is Maximum = "+ num2);
		}
		else
		{
			System.out.println("Num3 is Maximum = "+ num3);
		}
	}
}
*/

import java.util.*;
class MinNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter three numbers");
		
		int num1 = xyz.nextInt();
		int num2 = xyz.nextInt();
		int num3 = xyz.nextInt();
		
		if(num1<num2 && num1<num3)
		{
			System.out.println("Num1 is Maximum = "+ num1);
		}
		else
		{
			if(num2<num3)
			{
				System.out.println("Num2 is Maximum = "+ num2);
			}
		
		else
		{
			System.out.println("Num3 is Maximum = "+ num3);
		}
		}
	}
}	