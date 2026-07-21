/*65.Check whether a string ends with a given suffix.*/

import java.util.*;
class Day7Suffix
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter the Input");
		String str = xyz.next();
		
		System.out.println("Enter the Suffix");
		String s = xyz.next();
		
		boolean flag = true;
			
		if(s.length()>str.length())
		{
			flag = false;
		}
		else
		{
			int i = str.length()-1;
		    int j = s.length()-1;
			
			while(j>=0)
			{
				if(str.charAt(i) != s.charAt(j))
				{
					flag = false;
					break;
				}
				i--;
				j--;
			}
		}
		if(flag)
		{
			System.out.println("Ends with suffix");
		}
		else
		{
			System.out.println("not ends with suffix");
		}
	}
}
