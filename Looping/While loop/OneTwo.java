/*Question 35: Write a java program to enter a number and print it in words.
Input:

Number = 123

Output:

One Two Three

Explanation:

Each digit is separated and converted into its word form.
1 ? One, 2 ? Two, 3 ? Three.*/

import java.util.*;
class OneTwo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		int rev = 0;
		
		while(n>0)
		{
			int digit = n%10;
			rev = rev * 10 + digit;
			n=n/10;
		}
		while(rev>0)
		{
			int digit = rev%10;
			
			switch (digit) 
			{
                case 1: System.out.print("One "); break;
                case 2: System.out.print("Two "); break;
                case 3: System.out.print("Three "); break;
			}
			rev = rev/10;
		}

	}
}