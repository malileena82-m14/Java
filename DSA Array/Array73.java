/*Question 73: Sum of All Subarrays
Description:

Given an array of size n, calculate the sum of all possible subarrays.

A subarray is a contiguous part of an array.
Input:
n = 3
Array = [1, 2, 3]

Output:
Subarrays:
[1] ? 1
[1,2] ? 3
[1,2,3] ? 6
[2] ? 2
[2,3] ? 5
[3] ? 3

Total Sum = 20
Explanation:
We use two loops:
First loop selects starting index.
Second loop selects ending index and keeps adding elements.

Number of subarrays = n(n+1)/2
For n=3 ? 6 subarrays.

Time Complexity: O(n²)
Because two nested loops generate all subarray*/

import java.util.*;
class Array73
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size");
		
		int size = xyz.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter the Array");
		for(int i=0;i<size;i++)
		{
			a[i] = xyz.nextInt();
		}
		int total=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum = sum+a[k];
					System.out.println(" "+a[k]);
				
				}
				System.out.println("Sum ="+sum);
				total=total+sum;
			}
		}
		System.out.println("total = "+total);
	}
}