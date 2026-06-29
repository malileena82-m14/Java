/*
Question 43: Write a Java program to accept two integers and check whether they are equal.
Input:
A = 50
B = 50

Output:
Equal

Explanation:
If both numbers have the same value, they are equal; otherwise, they are not equal.
*/
import java.util.*;
class Equal
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int A = xyz.nextInt();
		int B = xyz.nextInt();
		
		System.out.println(A==B ?"Equal":"not Equal");
	}
}