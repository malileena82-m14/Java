/*28. Print characters at odd indexes*/

import java.util.*;
class Day3Odd
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = xyz.nextLine();
		
		System.out.println("Odd Indexes");
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(i%2!=0)
			{
				System.out.println(ch);
			}
		}
	}
}