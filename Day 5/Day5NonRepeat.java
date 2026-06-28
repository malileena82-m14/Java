/*41. Find the first non-repeated character.*/

import java.util.*;
class Day5NonRepeat
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = xyz.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int count =0;
			for(int j=0;j<str.length();j++)
			{
				if(ch==str.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
		      System.out.println("First Non Repeated Character :" +ch);
			  break;
			}
		}
	}
}