/*42. Find the first repeated character.*/

import java.util.*;
class Day5Firstrepeat
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = xyz.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				if(ch==str.charAt(j))
				{
					System.out.println("First Repeated Character : " + ch);
					return;
				}
			}
		}
		System.out.println("No Repeated Charcter");
	}
}