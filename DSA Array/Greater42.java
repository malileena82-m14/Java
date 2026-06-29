/*Question 42: Write a program in java to print next greater elements in a given unsorted array. 
Elements for which no greater element exist, consider next greater element as -1.
Input:
Array = [5, 3, 10, 9, 6, 13]

Output:
Next Greater Elements = [10, 10, 13, 13, 13, -1]

Explanation:
For each element search the right side of the array and find the first element greater than it; if none exists 
return -1.*/
import java.util.*;
class Greater42
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[] = new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]= xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<a[2])
			{
				a[i]=10;
			}
		}
	}
}