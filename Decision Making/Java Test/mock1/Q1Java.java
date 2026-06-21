/*Q1. Write a program to check whether a number is divisible by 5 and 11 yes or not, using 
conditional & ternary operators. */

import java.util.*;
class Q1Java
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the two number");
		
		int n = xyz.nextInt();
		
		System.out.println(n1%5==0 && n%11==0? "divisible":"not divisible");
	}
}