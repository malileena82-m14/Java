/*Question 65: Count Digits in a Number
Description:
Given integer n, count number of digits using division by 10.
Input:
n = 12345

Output:
Digits = 5

Explanation:
Each step removes one digit.

Time Complexity: O(log n)*/

import java.util.*;
class Digit65
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=xyz.nextInt();
		int count=0;
		
			while(n>0)
			{
				n=n/10;
				count++;
			}
			System.out.println("Digit ="+count);
		
	}
}