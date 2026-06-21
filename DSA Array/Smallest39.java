/*Question 39: Write a program in java to find the smallest missing element from a sorted array?
Input:
Array = [0, 1, 3, 4, 5, 6, 7, 9]

Output:
Smallest Missing Element = 2

Explanation:
Traverse the array and compare each element with its expected index value; the first mismatch indicates the missing number.*/
import java.util.*;
class Smallest39
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[] = new int[8];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=i)
			{
				System.out.println("Smallest element missing = "+i);
				flag = true;
				break;
			}
		}
	}
}