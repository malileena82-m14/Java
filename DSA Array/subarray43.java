/*Question 43: Write a program in java to find a subarray with given sum from the given array?
Input:
Array = [3, 4, -7, 1, 3, 3, 1, -4]
Target Sum = 7

Output:
Subarrays = [3,4], [3,4,-7,1,3,3], [1,3,3], [3,3,1]

Explanation:
Check all contiguous subarrays and calculate their sums to identify those equal to the target value.*/

import java.util.*;
class subarray43
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[] = new int [8];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Enter the Target sum");
		int t = xyz.nextInt();
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum = sum+a[j];
				
				if(sum == t)
				{
					flag = true;
					
					System.out.print("Subarray = [ ");
					for(int k=i;k<=j;k++)
					{
						System.out.print(" "+a[k]);
					}
					System.out.println("]");
				}
			}
		}
	}
}