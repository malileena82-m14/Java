/*Q8. You are given a sorted integer array that may contain duplicate values. Your task is to 
remove all duplicate elements so that each number appears only once and print the total 
count of unique elements. 
Description: 
Use two pointers: 
• One pointer keeps track of unique elements position.  
• Another pointer scans the array. 
Whenever a new unique element is found, place it in the correct position.  
Input: 
arr = [1, 1, 2, 2, 3, 4, 4, 5] 
Output: 
Unique Elements: [1, 2, 3, 4, 5] 
Count = 5*/

import java.util.*;
class Q8
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size");
		
		int size = xyz.nextInt();
		int a[] = new int [size];
		
		System.out.println("Enter the array");
		for(int i=0;i<size;i++)
		{
			a[i] = xyz.nextInt(); 
		}
		System.out.println("Unique Element = ");
		boolean flag=false;
		for(int i=0;i<size-1;i++)
		{
			
			for(int j=i+1;j<size-1;j++)
			{
				
				if(a[i]==a[j])
				{   
					for(int k=j;k<size-1;k++)
					{
						a[k]= a[k+1];
					}
					j--;
					size--;
				}
			}
		}
		System.out.println("Unique number =");
		for(int i=0;i<size;i++)
		{
			System.out.println(" " +a[i]);
		}
		int cnt=0;
		System.out.print("Count =");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
			cnt++;
		}
	}
}