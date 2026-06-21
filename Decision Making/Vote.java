/*
Question 12: Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
Input:
Age = 18

Output
Eligible to vote

Explanation:
According to voting rules, a person must be at least 18 years old to vote.
If age ? 18 ? Eligible
Otherwise ? Not Eligible
*/
import java.util.*;
class Vote
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Age");
		
		int A = xyz.nextInt();
		
		if(A>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("not eligible");
		}
		
	}
	
}