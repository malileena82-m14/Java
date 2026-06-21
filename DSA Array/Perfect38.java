/*Question 38: Count the number of Perfect numbers in an array.
Input:
Array = [6, 28, 10, 12, 496]

Output:
Count of Perfect Numbers = 3

Explanation:
For each element calculate the sum of its divisors and if the sum equals the number then it is a perfect number.*/

import java.util.*;
class Perfect38
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[] = new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		int perfectcnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=1;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					sum = sum+j;
				}
			}
			if(sum==a[i])
			{
				perfectcnt++;
			}
		}
		System.out.println("Count Perfect Number = "+perfectcnt);
	}
}