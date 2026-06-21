/*Question 40: Write a Java program to sort a given array in ascending & descending order.
Input:
Array = [12, 5, 9, 34, 1]

Output:
Ascending Order = [1, 5, 9, 12, 34]
Descending Order = [34, 12, 9, 5, 1]

Explanation:
Arrange elements from smallest to largest for ascending order and reverse the order for descending.*/
import java.util.*;
class Ascending40
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[] = new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Ascending order = ");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]); 
		}
		System.out.println("\nDescending order = ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print("  "+a[i]);
		}
	}
}