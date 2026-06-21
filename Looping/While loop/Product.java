/*Question 12: Write a java program to calculate the product of digits in a number.
Input:

Number = 1234

Output:

Product of digits = 24

Explanation:

Digits are extracted one by one.
1 × 2 × 3 × 4 = 24.*/
import java.util.*;
class Product
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = xyz.nextInt();
		int product=1 ;
		
		while(num>0)
		{
			int digit = num%10;
		    product = product*digit;
			num = num/10;
			
		}
		System.out.println("Product of Digits = "+ product);
	}
}