/*71. Implement your own version of `String.equals().*/

import java.util.*;
class Day8Equal
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the String 1");
		String str1 = xyz.next();
		
		System.out.println("Enter the String 2");
		String str2 = xyz.next();
		
		boolean flag = true;
		
		if(str1.length()!=str2.length())
		{
			flag = false;
		}
		else
		{
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)!=str2.charAt(i))
				{
					flag = false;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("String 1 and String to equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
}