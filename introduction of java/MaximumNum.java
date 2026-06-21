/*
Question 41: Write a Java program to find the maximum among three numbers.
Input:
A = 10
B = 25
C = 15

Output:
Maximum = 25

Explanation:
The program compares all three numbers using conditional statements and prints the largest value.
*/
import java.util.*;
class MaximumNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		int c = xyz.nextInt();
		
		System.out.println((a>b && a>c) ?"Maximum" +a:(b>c)?"Maximum" + b:"Maximum" +c);
	}
}