/*
Question 51: Write a Java program to find the middle value among three distinct integers using ternary operator.
Input:
p = 10
q = 20
r = 15

Output:
Middle Number = 15

Explanation:
The middle number is the value that lies between the other two numbers.
Here, 15 lies between 10 and 20.
*/
import java.util.*;
class MiddleValue
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Integers");
		
		int p = xyz.nextInt();
		int q = xyz.nextInt();
		int r = xyz.nextInt();
		
		System.out.println((p>q && p<r)|| (p<q && p>r)? "middle value = "+ p :(q>p && q<r)||(q<p &&q>r)? "middle value =" + q:"middle value = "+r);
	}
}