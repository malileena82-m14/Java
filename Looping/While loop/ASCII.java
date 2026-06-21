/*Question 15: Write a java program to print all ASCII characters with their values.
Input:

No input required

Output (Sample):

A = 65
B = 66
...

Explanation:

The program uses a loop from 0 to 127.
Each number is converted to its corresponding character and printed.*/

import java.util.*;
class ASCII
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int  i=0;
		
		for(i=0 ;i<=127; i++)
		{
			System.out.println((char)i+ "=" +i);
		}
	}
}