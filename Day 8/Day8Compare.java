/*72. Implement your own version of `String.compareTo()`.*/

import java.util.*;
class Day8Compare
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1 = xyz.next();
		
		System.out.println("Enter String 2");
		String str2 = xyz.next();
		
		int len;
		
		if(str1.length() < str2.length())
		{
			len = str1.length();
		}
		else
		{
			len = str2.length();
		}
		int result =0;
		for(int i=0;i<len;i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				result = str1.charAt(i) - str2.charAt(i);
				break;
			}
		}
		if(result==0)
		{
			result = str1.length() - str2.length();
		}
		System.out.println("Compare String: "+result);
	}
}