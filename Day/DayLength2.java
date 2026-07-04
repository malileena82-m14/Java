/*2. Find the length of a string without using length().*/

import java.util.*;
class DayLength2
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter the input");
		String str = xyz.nextLine();
		char ch[] = str.toCharArray();
		
		int count=0;
		for(char c:ch)
		{
			count++;
		}
		System.out.println("Length =" +count++);
	}
}