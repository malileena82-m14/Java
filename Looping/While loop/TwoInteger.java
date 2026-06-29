/*Question 22: Write a Java program to check whether two integer arrays are equal.
Two arrays are considered equal if:
Input:
Array1 = [10, 20, 30, 40]
Array2 = [10, 20, 30, 40]

Output:
Arrays are equal.

Explanation:
First compare the lengths of both arrays and if they are equal then compare elements at each index; 
if all elements match the arrays are equal otherwise they are not.*/
import java.util.*;
class TwoInteger
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array1");
		
		int a[] = new int[4];
		int b[] = new int[4];
		
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
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[i])
				{
					
				}
				
			}
		}
		System.out.println("Arrays are equal");
	}
}