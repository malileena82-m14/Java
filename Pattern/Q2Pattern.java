/*Q2. Write a java program to print this pattern.   
* * * * *        
*  		*      
* 		*   
* 		*
* * * * *
*/

import java.util.*;
class Q2Pattern
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}