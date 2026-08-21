/*Q3. Write a Java program to search a given number in a Vector.
Description
Store integer values in Vector.
Accept a number to search.
Check using loop or contains() method.
Print found or not found.
Input
Enter number of elements:
5

Enter elements:
10
22
35
48
50

Enter number to search:
35
Output
Element found in vector*/

package Assignment;
import java.util.*;
public class Assignment3 {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		Vector v = new Vector();
		
		System.out.println("Enter number of elememts");
		int n = xyz.nextInt();
		System.out.println("Enter elements");
		
		for(int i=0;i<n;i++)
		{
			int value = xyz.nextInt();
			v.add(value);
		}
		
		System.out.println("Enter number to search");
		int skey = xyz.nextInt();
		
		if(v.contains(skey))
		{
			System.out.println("Elements is found");
		}
		else
		{
			System.out.println("Elements is not found");
		}
	}
}
