/*Question 48: Write a java program to merge of two given array.
Input:
Array1 = [1, 2, 3, 4, 5]
Array2 = [6, 7, 8, 9, 10]

Output:
Merged Array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Explanation:
Copy all elements of the first array followed by elements of the second array into a new array.*/

import java.util.*;
class MergeArray48
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array1");
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Enter the Array2");
		for(int i=0;i<b.length;i++)
		{
			b[i] = xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		int k=a.length;
		for(int i=0;i<b.length;i++,k++)
		{
			c[k] = b[i];
		}
		System.out.println("c[i] =");
		for(int i=0;i<c.length;i++)
		{
		  System.out.println(" "+c[i]);
		}
	}
}
