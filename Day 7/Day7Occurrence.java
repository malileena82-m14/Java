/*Q62Find the number of occurrences of a substring.*/

import java.util.*;
class Day7Occurrence
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.next();
		
		System.out.println("Enter the SubString");
		String sub = xyz.next();
		
		int count=0;
		for(int i=0;i<str.length()-sub.length();i++)
		{
			String temp = str.substring(i,i+sub.length());
			if(temp.equals(sub))
			{
				count++;
			}
		}
		System.out.println("Occurrences = "+count);
	}
}