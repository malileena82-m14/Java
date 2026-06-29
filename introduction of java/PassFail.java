/*
Question 48: Write a Java program to print Pass if marks are 40 or above, otherwise Fail.
Input:
Marks = 38

Output:
Fail

Explanation:
If marks ? 40, the result is Pass.
If marks are below 40, the result is Fail.
*/
import java.util.*;
class PassFail
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Marks");
		
		int mark = xyz.nextInt();
		
		System.out.println(mark>=40 ?"pass": "fail");
	}
}
		