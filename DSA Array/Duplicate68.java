/*Question 68: Find Duplicate Using Nested Loop
Description:
Check if array contains duplicate elements.
Input:
[1,2,3,2]

Output
Duplicate Found

Explanation:
Each element compared with others.

Time Complexity: O(n²)*/
import java.util.*;
class Duplicate68
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[]= new int[4];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate found");
				}
			}
		}
	}
}