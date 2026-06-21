/*Question 52: Write a java program to display top three value from array.
Input:
Array = [78, 90, 90, 86, 85, 92, 70, 92]

Output:
Top Three Values = 92, 90, 86

Explanation:
Traverse the array and identify the three largest distinct values by comparing elements and updating the first, second, 
and third maximum values accordingly while ignoring duplicates.*/
import java.util.*;
class TopThree52
{
	public static void main(String x[])
	{
		Scanner xyz =  new Scanner(System.in);
		System.out.println("Enter the Array");
		
		int a[] = new int[8];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			int val = a[i];
			
			if(val==first || val==second || val==third)
				continue;
			
			if(val>first)
			{
				third = second;
				second = first;
				first = val;
			}
			else if(val>second)
			{
				third = second;
				second = val;
			}
			else if(val>third)
			{
				third = val;
			}
		}
		System.out.println("Top Three Values = " + first + ", " + second + ", " + third);
	}
}