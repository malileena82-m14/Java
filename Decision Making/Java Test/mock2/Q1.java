/*Q1.  Write a java program to check if a number is a happy number or not.*/

import java.util.*;
class Q1
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		
		while(n!=1 && n!=4)// 19!=1 && 19!=4 condition true then check the next step
		{
			int sum = 0;
			
			while(n>0)//19
			{
				int digit = n%10;//9
				sum = sum + (digit*digit);//0+9=81
				n = n/10;//1
			}
			    n = sum;
		}
				if(n==1) //if 1==1 then condition true and print the statement
				{
					System.out.println("Happy Number");
				}
				else
				{
					System.out.println("Not Happy Number");
				}
		
	}
}
