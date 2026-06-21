/*Question 9: Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment*/

import java.util.*;
class CopyArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[4];
		System.out.println("Enter the Array 1");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		System.out.println("Array 2 is:");
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]+ " ");
		}
	}
}