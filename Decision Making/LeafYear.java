/*
Question 8: Write a Java program to check whether a year is a leap year or not.
Input:
Year = 2024

Output:
Leap Year

Explanation:
A year is leap if:

Divisible by 4

Not divisible by 100 unless divisible by 400
*/
import java.util.*;
class LeapYear
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the year");
		
		int y = xyz.nextInt();
		
		if(y%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}
	
}