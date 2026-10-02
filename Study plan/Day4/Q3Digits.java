/*3. Take a number and find its largest digit, smallest digit, sum of digits, and count of even and odd digits 
using loops and if-else. */

import java.util.*;
class Q3Digits
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number");
		int n = xyz.nextInt();
		
		int ld = 0;
		int sd = Integer.MAX_VALUE;
		int sum =0;
		int ecnt =0;
		int ocnt =0;
		
		while(n>0)
		{
			int d = n%10;
			sum =sum+d;
			if(d>ld)
			{
				ld = d;
			}
			if(d<sd)
			{
				sd = d;
			}
			if(d%2==0)
			{
				ecnt++;
			}
			else
			{
				ocnt++;
			}
			n = n/10;
		}
		System.out.println("Largest Number = "+ld);
		System.out.println("Smallest Number = "+sd);
		System.out.println("Sum = "+sum);
		System.out.println("Even Number count= "+ecnt);
		System.out.println("Odd Number count = "+ocnt);
		
	}
}