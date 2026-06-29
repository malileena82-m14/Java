/*
Question 11: Write a Java program to enter marks of five subjects and calculate total marks and percentage.
Input:
Marks = 70, 75, 80, 65, 60

Output:
Total = 350
Percentage = 70%

Explanation:
Total marks are calculated by adding all five subject marks.
Percentage = Total ÷ 5.
*/

import java.util.*;
class Marks
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter marks of five subjects");
		
		int m1 = xyz.nextInt();
		int m2 = xyz.nextInt();
		int m3 = xyz.nextInt();
		int m4 = xyz.nextInt();
		int m5 = xyz.nextInt();
		
		int Total = m1+m2+m3+m4+m5;
		System.out.println("Total = "+ Total);
		
		int Percentage = Total /5;
		System.out.println("percentage = "+ Percentage);		
	}
}