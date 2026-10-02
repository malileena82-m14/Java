/*5. Take a number and calculate the factorial of each digit. Find their total sum and check whether the number is a 
Strong number.*/

import java.util.*;
class Q5Factorial
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number");
		int n = xyz.nextInt();
		
		int original = n;
		int sum =0;
		
		while(n>0)
		{
			int d = n%10;
			int fact =1;
			for(int i=1;i<=d;i++)
			{
				fact = fact*i;
			}
			sum = sum+fact;
			n =n/10;
		}
		if(original==sum)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
}