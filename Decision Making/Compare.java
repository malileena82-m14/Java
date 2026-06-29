/*Question 37: Compare two numbers: greater, smaller, or equal.

   Input: Two integers
   Logic: if-else if
   Output: Greater, smaller, or equal.
Input:
A = 25
B = 30
Output:
A is smaller than B
Explanation:
Use if-else to compare values.*/
import java.util.*;
class Compare
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int A = xyz.nextInt();
		int B = xyz.nextInt();
		
		if(A>B)
		{
			System.out.println("A is Greater than B");
		}
		else if(A==B)
		{
			System.out.println("A equals to equal B");
		}
		else
		{
			System.out.println("A is smaller than B");
		}
	}
}