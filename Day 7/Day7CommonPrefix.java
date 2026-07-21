/*66. Find the common prefix of two strings.*/

import java.util.*;
class Day7CommonPrefix
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter a first String");
		String str1 = xyz.next();
		
		System.out.println("Enter a second String");
		String str2 = xyz.next();
		
		int len;
		
		if(str1.length()<str2.length())
		{
			len = str1.length();//first string
		}
		else
		{
			len = str2.length();//second string
		}
		String result = "";
		
		for(int i=0;i<len;i++)
		{
			if(str1.charAt(i)==str2.charAt(i))
			{
				result = result + str1.charAt(i);
			}
			else
			{
				break;
			}
		}
		System.out.println("Common prefix: "+result);
	}
}