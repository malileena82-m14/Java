/*
Question 52: Write a Java program to check eligibility based on percentage and income.
Input:
Percentage = 78
Income = 180000

Output:
Eligible

Explanation:
Eligibility condition:
Percentage ? 75 and Income < 200000.
Both conditions are satisfied.
*/
import java.util.*;
class Income
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int p = xyz.nextInt();
		int I = xyz.nextInt();
		
		System.out.println((p>=75 && I<200000)? "Satisfied": "not Satisfied");
	}
}	