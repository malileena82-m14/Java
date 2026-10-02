/*1. Take n numbers from the user and count how many are positive, negative, and zero. Also print the largest 
positive number and smallest negative number.*/

import java.util.*;
class Q1PosNegZero
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input");
		int n  = xyz.nextInt();
		
		int posCount = 0;
		int negCount = 0;
		int zeroCount = 0;
		int largpos = 0;
		int smallneg = 0;
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Number");
			int num = xyz.nextInt();
			
			if(num>0)
			{
				posCount++;
				if(num>largpos)
				{
					largpos = num;
				}
				
			}
			else if(num<0)
			{
				negCount++;
				if(num<smallneg)
				{
					smallneg = num;
				}
			}
			else if(num==0)
			{
				zeroCount++;
			}
		}
		System.out.println("Positive Number : "+posCount);
		System.out.println("Negative Number : "+negCount);
		System.out.println("Zero Number : "+zeroCount);	
		System.out.println("Largest positive Number : "+largpos);	
		System.out.println("Smallest Negative Number : "+smallneg);	
		
		
	}
}