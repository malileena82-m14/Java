/*26. Check whether a string contains only lowercase letters.*/

import java.util.*;
class Day3Lowercase
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.nextLine();
		
		boolean flag = true;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				flag = false;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Only Lowercase letters");
		}
		else
		{
			System.out.println("Not lowercase letters");
		}
	}
}