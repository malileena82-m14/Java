/*WAP program to find the factorial of a number*/

import java.util.*;
class Factorial
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = xyz.nextInt();
		int fact = (n==0 || n==1)? 1: n*(n-1)*(n-2)*(n-3)*(n-4);
		System.out.println("Factorial = " + fact);
	}
}