/*
Question 34: Write a Java program to check whether a number is positive, negative, or zero.
Input:
Number = -8

Output:
Negative

Explanation:
If number > 0 ? Positive
If number < 0 ? Negative
If number = 0 ? Zero
*/
import java.util.*;
class PositiveNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int no = xyz.nextInt();
		
		System.out.println((no>0)? "positive" : (no==0)? "zero" : "negative");
	}
}
		