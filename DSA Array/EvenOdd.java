/*Question 3: Write a Java program to display even & odd values from an array.
Input:
Array Size = 6
Array Elements = 11 20 33 42 55 60
Output:
Even Values = 20 42 60
Odd Values = 11 33 55
Explanation:
? Traverse the array element by element.
? If an element is divisible by 2, it is even. Otherwise, it is odd.
? Separate lists are displayed for even and odd values.*/

import java.util.*;
class EvenOdd
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the element");
		
		int a[] = new int[6];
		
		for(int i=0 ;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		
		System.out.println("Even Values = ");
		for(int i=0; i<a.length;i++)
		{
		  if(a[i]%2==0)
		  {
			  System.out.println(a[i]+" ");
		  }
		}
		
		System.out.println("Odd Values = ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
}