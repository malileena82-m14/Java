/*Question 36: Replace each element with its factorial.
Input:
Array = [3, 4, 5]

Output:
Array = [6, 24, 120]

Explanation:
For every element compute the factorial by multiplying all numbers from 1 to that element and update the 
array with the result.*/

import java.util.*;
class Factorial36
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[] = new int[3];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			int fact =1;
			for(int j=1;j<=a[i];j++)
			{
				fact=fact*j;
			}
			a[i] = fact;
		}
		System.out.println("Fact Array = ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
	}
}
