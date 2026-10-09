/*
Q6. Write a java program to print this pattern.          
 
        *        
      * *     
    * * *   
  * * * * 
* * * * * 

*/

import java.util.*;
class Q6Pattern
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}