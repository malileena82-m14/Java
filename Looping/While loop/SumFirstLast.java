/*Question 19: Write a java program to find the sum of the first and last digit of a number.
Input:

Number = 1234

Output:

Sum = 5

Explanation:

First digit = 1
Last digit = 4
Sum = 1 + 4 = 5.*/
import java.util.*;
class SumFirstLast
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = xyz.nextInt();
		int last = num%10;
		int first = num;
		int sum=0;
		
		while(first>=10)
		{
			first =first/10;
			sum = first+last;
		}
		System.out.println("Sum = "+ sum);
			
	}
}