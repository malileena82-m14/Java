/*Question 64: Find Maximum in Array
Description:
Find the largest element in an array.
Input:
[3,8,2,9,1]

Output:
Max = 9

Explanation:
Each element compared once.

Time Complexity: O(n)*/
import java.util.*;
class Max64
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		
		int a[]= new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		int max=a[0];
		
		System.out.println("Max =");
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max = a[i];
			}
		}
		System.out.println(" "+max);
	}
}