/*Question 30: Write a Java program to check whether a number is a multiple of both 3 and 5.
Input:
15

Output:
Multiple of both 3 and 5

Explanation:
A number divisible by both 3 and 5 must give remainder 0 when divided by 3 and by 5.
The logical AND operator is used to check both conditions.
*/

import java.util.*;
class Multiple
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int no = xyz.nextInt();
		System.out.println((no%3==0)&& (no%15==0)? "multiple of both 3 & 5" : "not multiple of both 3 & 5");
	}
}