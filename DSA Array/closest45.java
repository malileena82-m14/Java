/*Question 45: Write a program in java to find two elements whose sum is closest to zero.
Input:
Array = [38, 44, 63, -51, -35, 19, 84, -69, 4, -46]

Output:
Pair Closest to Zero = [44, -46]

Explanation:
Check pairs of elements and compute their sums; the pair whose sum is nearest to zero is selected.*/
import java.util.*;
class closest45
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[] = new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
			}
			if(sum<0)
			{
				System.out.println("sum "+sum);
			}
		}
	}
}