/*Q5. Given an integer array and a specific element, write a Java program to find the index 
position of that element in the array. If the element is not found, print -1. 
 Input :- Array: {10, 20, 30, 40, 50} 
  Element to find: 30 
Output :- Element found at index: 2*/

import java.util.*;
class Q5
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = xyz.nextInt();
		int a[] =  new int[size];
		System.out.println("Enter the Array");
		for(int i=0;i<size;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Enter the search element");
		int cnt=0;
		boolean flag = false;
		int n = xyz.nextInt();
		for(int i=0;i<size;i++) // if condition is true then check next step
		{
			if(a[i]==n) // condition true count number
			{
				flag = true;
				break;
			}
			cnt++;
		}
		if(flag)
		{
			System.out.println("Element found at index " +cnt);
		}
		else
		{
			System.out.println("Element is not found");
		}
	}
}