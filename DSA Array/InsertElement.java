/*Question 12: Write a program in java to insert an element at desired position from an array.
Input the size of array : 6

Input 5 elements in the array in ascending order :
1 2 3 4 5

Input the position where to insert : 2
Value : 200

Expected Output : The new list is : 1 2 200 3 4 5*/

import java.util.*;
class InsertElement
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		
		int a[] = new int [6];
		for(int i=0;i<(a.length-1);i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Array before insert");
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter the index");
		int index = xyz.nextInt();
		System.out.println("Enter the value");
		int value = xyz.nextInt();
		for(int i=(a.length-2);i>=index;i--)
		{
			a[i+1] = a[i];
		}
		a[index] = value;
		System.out.println("Display Array After insert");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}