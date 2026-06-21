/*Question 26: Write a java program to count all pairs of elements in an array whose sum is equal 
to a given number.
Input:
Array = [1, 5, 7, -1, 5]
Sum = 6

Output:
Number of Pairs = 3

Explanation:
Check all possible pairs in the array and count those pairs whose sum equals the given value.*/
import java.util.*;
class CountPair
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size");
		
		int size = xyz.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the Array");
		for(int i=0;i<size;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Enter the sum");
		int sum = xyz.nextInt();
		int count=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(sum==a[i]+a[j])
				{
					count++;
				}
			}
		}
		System.out.println("Number of pairs = "+ count);
	}
}