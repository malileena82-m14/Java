/*Question 72: Print All Subarrays
Description:
Print all possible subarrays of array size n.
Input:
[1,2,3]

Output:
[1] [1,2] [1,2,3] [2] [2,3] [3]

Time Complexity: O(n²)*/

import java.util.*;
class Subarray72
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		
		int a[] = new int[3];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.println(" "+a[k]);
				}
				System.out.println();
			}
		}
	}
}
