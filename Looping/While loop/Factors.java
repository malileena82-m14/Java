/*Question 17: Write a java program to find all factors of a number.
Input:

Number = 12

Output:

Factors: 1 2 3 4 6 12

Explanation:

A factor divides the number completely without remainder.
All numbers that divide 12 exactly are printed.*/
import java.util.*;
class Factors
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = xyz.nextInt();
		int i;
		
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i + " ");
			}
		}
	}
}