/*Question 11: Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables 
(largest, secondLargest).*/

import java.util.*;
class SecondLar
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[] = new int[6];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] =xyz.nextInt();
		}
		int sm = a[1];
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				sm=max;
				max=a[i];
			}
			else if(a[i]<max && a[i]>sm)
			{
				sm=a[i];
			}
		}
		System.out.println("Max value is "+max);
		System.out.println("Second max value is "+sm);
	}
}