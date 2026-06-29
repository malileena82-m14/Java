/*Question 35: Create a new array where each element is the square of the original.
Input:
Array = [2, 4, 6, 8]

Output:
New Array = [4, 16, 36, 64]

Explanation:
For each index multiply the element with itself and store the result in a new array.*/
import java.util.*;
class SquareEle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[] = new int[4];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("New Array = ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = a[i]*a[i];
			System.out.print(" "+a[i]);
		}
	}
}