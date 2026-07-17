/*Find the maximum occurring character.*/

import java.util.*;
class Day5MaxOccur
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.nextLine();
		
		int max=0;
		char maxChar = ' ';
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			char ch = str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				if(ch==str.charAt(j))
				{
					count++;
				}
			}
			if(count>max)
			{
				max = count;
				maxChar = ch;
			}
		}
		System.out.println("Maximum Occuring Character: "+maxChar);
		System.out.println("Count: "+ max);
	}
}