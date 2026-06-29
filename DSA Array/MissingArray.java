/*Question 8: Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, 
it is missing.*/

import java.util.*;
class MissingArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the array");
		
		for(int i=0;i<5;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Enter the max number");
		int n = xyz.nextInt();
		
		System.out.println("Missing elements are:");
		for(int i=1;i<=n;i++)
		{
			boolean found = false;
			for(int j=0;j<5;j++)
			{
				if(a[j] == i)
				{
					found = true;
					break;
				}
			}
			if(found==false)
			{
				System.out.println(i+" ");
			}
		}
	}
}