/*Question 19: Given a score out of 100, print Excellent (?90), Good (?75), Average (?50), Poor (< 50) — using nested ternary operators.
Input:
Score = 82

Output:
Good

Explanation:
82 is greater than 75 but less than 90, so the grade is "Good".
Nested ternary operators are used instead of multiple if-else statements.*/

import java.util.*;
class Score
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Score");
		
		int s = xyz.nextInt();
		
		if(s>=90 && s<=90)//102>=90 ||102<=90
		{
			System.out.println("Excellent");
		}
		else
		{ 
			if(s>=75 && s<=75)
			{
				System.out.println("Good");
			}
		else 
		{
			if(s>=50 && s<=50)
			{
				System.out.println("Average");
			}
		else
		{
			if(s<50)
			{
				System.out.println("Poor");
			}
		
		else
		{
			System.out.println("marks invalid");
		}
		}
		}
		}
	}
}