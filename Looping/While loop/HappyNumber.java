/*Question 27: Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps where 
in each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
Input:

Number = 19

Output:

Happy Number

Explanation:

1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1
Since it reaches 1, it is a Happy Number.*/

import java.util.*;
class HappyNumber
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		
		while(n!=1 && n!=4)
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
				if(n==1)
				{
					System.out.println("Happy Number");
				}
				else
				{
					System.out.println("Not Happy Number");
				}
		
	}
}
