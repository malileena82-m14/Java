/*Description: Check whether a given number is prime or not. A prime number is divisible only by 1 and itself.
Input:
n = 29

Output:
29 is a Prime Number

Explanation:
We check divisibility from 2 up to ?n.

If any number divides n ? Not prime.
If none divides ? Prime.

For n = 29
We check up to ?29 ? 5.

Time Complexity: O(?n)
Because loop runs from 2 to square root of n.*/

import java.util.*;
class Prime75
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println( n +" is a Prime Number");
		}
		else
		{
			System.out.println( n +" is not a Prime Number");
		}
	}
}