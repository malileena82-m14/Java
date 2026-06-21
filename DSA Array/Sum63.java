/*Question 63: Sum of Array Elements
Description:
Given an array of n elements, compute the sum.
Input:
n = 5
Array: [1,2,3,4,5]

Output:
Sum = 15

Explanation:
Each element is visited once.

Time Complexity: O(n)*/
import java.util.*;
class Sum63
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		
		int n = xyz.nextInt();
		int a[]= new int[5];
		
		System.out.println("Enter the Array");
		
		for(int i=0;i<n;i++)
		{
			a[i] = xyz.nextInt();
		}
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum =sum+i;
		}
		System.out.println("Sum = "+sum);
	}
}