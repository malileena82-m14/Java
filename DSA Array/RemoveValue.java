/*Question 14: Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.*/

import java.util.*;
class RemoveValue
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size");
		
		int size = xyz.nextInt();
		int a[] = new int [size];
		System.out.println("Enter the Array");
		for(int i=0;i<size;i++)
		{
			a[i] = xyz.nextInt();
		}
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
				if(a[i]==a[j])
				{
					for(int k=j;k<size-1;k++)
					{
						a[k] = a[k+1];
					}
					j--;
					size--;
				}
			}
		}
		System.out.println("after removing data");
		for(int i=0;i<=size-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
