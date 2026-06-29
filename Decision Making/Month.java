/*Question 30: Write a java program to enter month number between(1-12) and print number of days in month using if else.
How to print the number of days in a given month using if else in java programming
Input:
Month = 2

Output
28 or 29 Days

Explanation:
January, March, May, July, August, October, December ? 31 days

April, June, September, November ? 30 days

February ? 28 days (29 in leap year)*/

import java.util.*;
class Month
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the month number");
		int m = xyz.nextInt();
		
		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12 )
		{
			System.out.println("31 Days");
		}
		else if(m==4 || m==6 || m==9 || m==11)
		{
			System.out.println("30 Days");
		}
		else
		{
			System.out.println("28 or 29 Days");
		}
	}
}
