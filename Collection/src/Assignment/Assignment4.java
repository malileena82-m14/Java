/*Q4. Write a Java program to remove a specific element from a Vector.
Description
Store elements in Vector.
Take element to remove.
Use remove() method.
Display updated Vector.
Input
Enter elements:
10
20
30
40

Enter element to remove:
30
Output
Updated Vector:
10
20
40*/

package Assignment;
import java.util.*;
public class Assignment4 {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		Vector v = new Vector();
		
		System.out.println("Enter number of Elements");
		int n = xyz.nextInt();
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			int value = xyz.nextInt();
			v.add(value);
		}
		System.out.println("Enter element to remove:");
		int r = xyz.nextInt();
		
		if(v.contains(r))
		{
			v.remove(v.indexOf(r));
			System.out.println("Elements are found");
		}
		else
		{
			System.out.println("Element not found");
		}
		System.out.println("Updated Vector");
		for(Object obj:v)
		{
			System.out.println(obj);
		}
		
	}
}
