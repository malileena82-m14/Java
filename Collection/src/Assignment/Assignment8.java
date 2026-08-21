/*Q8. Write a Java program to count how many even numbers are present in a Vector.
Description
Store integer values.
Traverse using loop.
Check number % 2 == 0.
Count even numbers.
Input
Enter elements:
10
15
20
25
30
Output
Total even numbers = 3*/

package Assignment;
import java.util.*;
public class Assignment8 {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		Vector v = new Vector();
		
		System.out.println("Enter number of elements");
		int no = xyz.nextInt();
		
		System.out.println("Enter elements: ");
		for(int i=0;i<no;i++)
		{
			int value = xyz.nextInt();
			v.add(value);
		}
		int count =0;
		for(Object obj:v)
		{
			int value = (int)obj;
			if(value%2==0)
			{
				count++;
			}
		}
		System.out.println("Total Even Numbers: "+count);
	}
}
