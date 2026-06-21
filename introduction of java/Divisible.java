/*Question 35: Write a Java program to check whether a number is divisible by both 5 and 11.
Input:
Number = 55

Output:
Divisible by 5 and 11

Explanation:
A number divisible by both 5 and 11 must give remainder 0 when divided by 5 and 11.
*/
import java.util.*;
class Divisible
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		
		System.out.println(n%5==0 && n%11==0 ? "Divisibleby 5 and 11" : "not Divisible");
	}
}