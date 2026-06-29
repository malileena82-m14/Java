/*Question 33: Write a java program to display 1 to nth Armstrong Number
Input:

n = 4

Output:

0 1 153 370

Explanation:

0 and 1 are Armstrong Numbers.
153 and 370 are Armstrong Numbers because the sum of cubes of their digits equals the num*/

import java.util.*;
class NArmstrong
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		int count =0;
		
		for(int i=0;count<n;i++)
		{
			int sum=0;
			int temp = i;
			
			while(temp>0)
			{
				int digit = temp%10;
		     	int c = digit*digit*digit;
			    sum = sum+c;
				temp = temp/10;
				
			}
			if(sum==i)
			{
				System.out.println(i + " ");
				count++;
			}
		}
		
	}
}