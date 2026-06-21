/*Question 41: Write a Java program to find the largest and smallest digit of a given number.
Explanation:
Use a while loop to extract digits, compare each digit to track max and min.
Input:

Number = 583902

Output:

Largest Digit = 9
Smallest Digit = 0

Explanation:

The program extracts each digit using a while loop.
Each digit is compared to track maximum and minimum values.*/

import java.util.*;
class LargestSmallest
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = xyz.nextInt();
		
		int max = 0;
		int min = 9;
		
		while(n>0)
		{
			int digit = n%10;
			if(digit>max)
			{
				max = digit;
			}
			if(digit<min)
			{
				min = digit;
			}
			n = n/10;
		}
		System.out.println("Largest Digit = "+max);
		System.out.println("Smallest Digit = "+min);
	}
}