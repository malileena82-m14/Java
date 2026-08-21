/*Q2. Write a Java program to store N elements in a Vector and print the total number of elements.
Description
Create Vector.
Take number of elements from user.
Store values.
Use size() method to find total elements.
Input
Enter number of elements:
4

Enter elements:
5
15
25
35
Output
Total elements in vector = 4*/

package Assignment;
import java.util.*;
public class Assignment2 {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		Vector v = new Vector();
		
		System.out.println("Enter Numbers of elements");
		int n = xyz.nextInt();
		
		System.out.println("Enter Elements");
		
		for(int i=0;i<n;i++)
		{
			int value = xyz.nextInt();
			v.add(value);
		}
		System.out.println("Elements in vector: "+v.size());
	}
}
