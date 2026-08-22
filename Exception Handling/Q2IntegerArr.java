/*Question 2: Write a Java program to handle ArrayIndexOutOfBoundsException while accessing array elements.
Create an integer array of fixed size and allow the user to enter an index number. If the index is beyond array size, 
handle the exception properly.
Asked In Practice Assignment
Input:
Enter array size: 5
Enter index to access: 7

Output:
Exception occurred: Index is out of range

Explanation:
ArrayIndexOutOfBoundsException occurs when accessing array index that does not exist. If user enters index 7 but 
array size is 5 (valid indices 0-4), exception is thrown. Catch this exception and display user-friendly message about valid range.*/

import java.util.*;
class Q2IntegerArr
{
	public static void main(String x[])
	{
		Scanner xyz =  new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = xyz.nextInt();
		
		int a[] = new int[size];
		try
		{
			System.out.println("Enter index to access: ");
			int i = xyz.nextInt();
			System.out.println(a[i]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception occurred: Index is out of range");
		}
	}
}