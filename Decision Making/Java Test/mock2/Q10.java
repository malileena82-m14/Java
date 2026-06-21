/*Q10. Write a Java program to find the maximum sum of a subarray where you are allowed to 
delete at most one element. 
Description 
• You can choose a continuous subarray.  
• You may delete one element from the subarray to maximize the sum.  
• If all elements are negative, return the maximum element.  
Input :- arr = [1, -2, 0, 3] 
Output :- 4*/

import java.util.*;
class Q10
{
	public static void main(String x[])
	{
		Scanner xyz =new Scanner(System.in);
		System.out.println("Enter the size");
		int size = xyz.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the Array");
		
		for(int i=0;i<size;i++)
		{
			a[i] = xyz.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			int sum=0;
			for(int j=i+1;j<size-1;j++)
			{
				System.out.println(" "+a[i]);
				sum = sum+j;
			}
			System.out.println("Sum = "+sum);
		}
		
	}
}