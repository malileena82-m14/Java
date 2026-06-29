/*Question 13: Write a java program to enter a number and print its reverse.
Input:

Number = 1234

Output:

Reversed Number = 4321

Explanation:

The program extracts the last digit and builds the reverse number.
Each digit is added in reverse order.*/
import java.util.*;
class ReverseDigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = xyz.nextInt();
		int rev = 0;
		
		while(num>0)
		{
			int digit = num%10;
			rev = rev *10+digit;
			
		    num = num/10;
		    
		}
		System.out.println("Reversed Number = " +rev);
	}
}
