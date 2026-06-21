/*Question 13: Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.*/
import java.util.*;
class NonzeroNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size");
		
		int size = xyz.nextInt();
		int a[] = new int [size];
		
		System.out.println("Enter the element");
		for(int i =0;i<size;i++)
		{
			a[i] = xyz.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]!=0)
			{
				System.out.println("Non-zero Element = "+ a[i]);
			}
		}
		
		
	}
}