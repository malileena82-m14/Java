/*
Question 49: Given marks out of 100, print grade using nested ternary operators.
Input:
Marks = 82

Output:
Good

Explanation:
Grades are assigned based on marks range:
? 90 ? Excellent
? 75 ? Good
? 50 ? Average
< 50 ? Poor

Since 82 lies between 75 and 89, the grade is Good.
*/
import java.util.*;
class Grade
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Marks");
		
		int mark = xyz.nextInt();
		
		System.out.println(mark>=90?"Excellent": mark>=75 ?"Good":mark>=50? "Average":"Poor");
		
	}
}