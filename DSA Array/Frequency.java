/*Question 27: Write a java program to count the frequency of each element in a given array.
Input:
Array = [1, 2, 2, 3, 3, 3, 4]

Output:
1 ? 1 time
2 ? 2 times
3 ? 3 times
4 ? 1 time

Explanation:
For each element in the array, count the number of occurrences by comparing it with all other elements.*/
import java.util.*;
class Frequency
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = xyz.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter the Array");
		int i=1;
		for(i=0;i<size;i++)
		{
			a[i] = xyz.nextInt();
		}
		
		int count=1;
		for(i=1;i<size;i++)
		{
			if(a[i]==a[i-1])
			{
				count++;
			}
			else
			{
				System.out.println(a[i-1]+" "+count+ "Times");
				count=1;
			}
		}
		System.out.println(a[i-1]+" "+count+ "Times");
	}
}