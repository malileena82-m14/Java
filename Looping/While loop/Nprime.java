/*Question 29: Write a java program to display 1 to nth Prime Number.
Input:

n = 5

Output:

2 3 5 7 11

Explanation:

Prime numbers are numbers divisible only by 1 and themselves.
The first 5 prime numbers are 2, 3, 5, 7, and 11.*/

import java.util.*;
class Nprime
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		int count=0;
		
		for(int num=2 ; count<n; num++)
		{
			int flag = 0;
			
			for(int i=2; i<=num/2; i++)
			{
				if(num%i==0)
				{
				  flag=1;
				  break;
				}
			}
			if(flag==0)
			{
				System.out.println(num + " ");
				count++;	
			}
		}
	}
}