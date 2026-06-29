/*
Question 15: Write a java program to find the minimum between two numbers.
Input:
Number1 = 8
Number2 = 12

Output
Minimum number = 8

Explanation:
Compare both numbers using if-else.
The smaller value is printed as minimum.
*/
import java.util.*;
class Minimum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		
		int num1 = xyz.nextInt();
		int num2 = xyz.nextInt();
		
		if(num1<num2)
		{
			System.out.println("Minimum number = "+ num1);
		}
		else
		{
			System.out.println("Minimum number = "+ num2);
		}
	}
}