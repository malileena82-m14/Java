/*
Q5. Write a java program to print this pattern.   
***** 
**** 
*** 
** 
*
 
*/

import java.util.*;
class Q5Pattern
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}