/*64. Check whether a string starts with a given prefix.*/

import java.util.*;
class Day7Prefix
{ 
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter the input");
		String s = xyz.next();
		
		System.out.println("Enter the Prefix");
		String p = xyz.next();
		
		boolean flag = true;
		
		if(p.length()>s.length())
		{
			flag = false;
		}
		else
		{
			for(int i=0;i<p.length();i++)
			{
				if(p.charAt(i)!=s.charAt(i))
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("starts with prefix");
			}
			else
			{
				System.out.println("not starts with prefix");
			}
		}
	}
}