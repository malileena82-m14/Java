/*Question 67: Count All Pairs in Array
Description:
Given array of size n, print all possible pairs (i,j).
Input:
n = 3

Output:
(1,2) (1,3) (2,3)

Explanation:
Nested loops.

Time Complexity: O(n²)*/
import java.util.*;
class Pair67
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=xyz.nextInt();
		
		for(int i=1;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				System.out.println(" " +i+","+" "+j);
			}
		}
	}
}