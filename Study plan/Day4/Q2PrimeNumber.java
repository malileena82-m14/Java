/*2. Take start and end values and print all prime numbers in the range. Also print the total number of primes and their sum. */

import java.util.*;
class Q2PrimeNumber
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Starting values");
		int start = xyz.nextInt();
		
		System.out.println("Enter Ending Values");
		int end = xyz.nextInt();
		
		int tcnt =0;
		int sum =0;
		
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" ");
				tcnt++;
				sum= sum+i;
			}
		}
		System.out.println("Total number of prime = "+tcnt);
		System.out.println("Sum of prime = "+sum);
	}
}