/*Q5. Write a Java program to find the maximum element in a Vector.
Description
Store integer values.
Assume first element as max.
Compare with remaining elements.
Print maximum value.
Input
Enter elements:
12
45
7
89
34
Output
Maximum element is 89*/

package Assignment;
import java.util.*;
public class Assignment5
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		Vector v = new Vector();
		
		System.out.println("Enter number element");
		int n = xyz.nextInt();
		
		System.out.println("Enter element");
		
		for(int i=0;i<n;i++)
		{
			int value = xyz.nextInt();
			v.add(value);
		}
		
		v.get(0);
		int max = (int)v.get(0);
		Iterator i = v.iterator();
		while(i.hasNext())
		{
			Object obj = i.next();
			if((int)obj>max)
			{
				max = (int)obj;
			}
		}
		System.out.println("Max Value is: "+max);
	}				
}
