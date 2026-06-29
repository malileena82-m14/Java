/*Question 70: Binary Search (Sorted Array)
Description:
Search target using binary search.
Input:
[1,3,5,7,9]
Target = 7

Output:
Found

Explanation:
Each step halves search space.

Time Complexity: O(log n)*/

import java.util.*;
class Binary70
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		
		int a[] = new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		
		System.out.println("Target");
		int target = xyz.nextInt();
		int start=0;
		int end = a.length-1;
		int mid =0;
		int index=-1;
		
		while(start<=end)
		{
			mid = (start+end)/2;

			if(a[mid]==target)
			{
				index=mid;
				break;
			}
			if(a[mid]<target)
			{
				start = mid +1;
			}
			else
			{
			   end = mid -1;
			}
			
		}
		if(index!=-1)
		{
			System.out.println("Data Found");
		}
		else
		{
			System.out.println("Data not found");
		}
		
	}
}