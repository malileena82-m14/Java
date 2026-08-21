/*Q7. Write a Java program to update an element at a specific position in a Vector.
Description
Store elements in Vector.
Ask user for position.
Accept new value.
Update using set(index,value) method.
Display updated Vector.
Input
Enter elements:
10
20
30
40

Enter position to update:
2

Enter new value:
99
Output
Updated Vector:
10
20
99
40*/

package Assignment;
import java.util.*;
public class Assignment7 {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		Vector v = new Vector();
		System.out.println("Enter number of elements");
		int num = xyz.nextInt();
		
		System.out.println("Enter elements");
		
		for(int i=0;i<num;i++)
		{
			int value = xyz.nextInt();
			v.add(value);
		}
		System.out.println("Enter Position to update");
		int pos = xyz.nextInt();
		
		System.out.println("Enter new value");
		int n = xyz.nextInt();
		
		if(pos >= 0 && pos < v.size())
		{
			v.set(pos, n);
			
			System.out.println("Upadate Vector: ");
			for(Object obj: v)
			{
				System.out.println(obj);
			}
		}
		else
		{
			System.out.println("Invalid Position");
		}
	}
}
