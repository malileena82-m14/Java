/*1.Print each character of a string.*/

import java.util.*;
class DayString
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}
}
