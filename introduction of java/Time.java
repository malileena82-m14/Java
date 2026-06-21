/*
Question 17: Write a Java program to convert seconds into hours, minutes, and seconds.
Input:
Seconds = 3665

Output:
Hours = 1
Minutes = 1
Seconds = 5

Explanation:
1 hour = 3600 seconds.
3665 ÷ 3600 gives 1 hour.
Remaining seconds are converted into minutes and seconds using division and modulus operations.
*/

import java.util.*;
class Time
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter the Seconds");
		
		int seconds = xyz.nextInt();
		int hour = seconds/3600;
		int rem = seconds%3600;
		int minutes = rem/60;
		seconds = rem%60;
		
		System.out.println("Hour = "+ hour + "minutes = "+ minutes + "seconds = "+ seconds );
	}
}