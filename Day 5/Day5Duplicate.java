/*. Remove duplicate characters from a string.*/

import java.util.*;
class Day5Duplicate
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.nextLine();
		
		String result = " ";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			boolean flag = false;
			for(int j=0;j<result.length();j++)
			{
				if(ch==result.charAt(j))
				{
					flag = true;
					break;
				}
			}
			if(flag==false)
			{
               result = result + ch;
			}
		}
		System.out.println("Duplicate Character: "+result);
	}
}