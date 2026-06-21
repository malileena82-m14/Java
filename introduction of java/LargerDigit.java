/*
Question 53: Write a Java program to print the larger digit between first and last digit of a three-digit number.
Input:
Number = 582

Output:
Larger Digit = 5

Explanation:
First digit = 5
Last digit = 2
Since 5 > 2, the larger digit is 5.
*/
import java.util.*;
class  Largerdigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Digit");
		
		int n = xyz.nextInt();
		int First = n/100;
		int Last = n%10;
		
		System.out.println(First>Last? "Larger digit = " + First : +Last );
		
	}
}