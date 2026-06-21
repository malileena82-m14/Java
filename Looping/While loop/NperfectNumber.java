/*Question 30: Write a java program to display 1 to nth Perfect Number
Input:

n = 2

Output:

6 28

Explanation:

The first perfect number is 6.
The second perfect number is 28.
Both numbers are equal to the sum of their proper divisors.*/

import java.util.*;
class NperfectNumber
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		int count = 0;
		
		for(int num=2 ; count<n; num++)
		{
			int sum=0;
			for(int i=1;i<=num/2;i++)
			{
				if(num%i==0)
				{
					sum = sum + i;
				}
			
			}
			if(sum==num)
			{
				System.out.println(num + " ");
				count++;
			}
		}
		
	}
}