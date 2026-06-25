/*25. Check whether a string contains only uppercase letters.*/

import java.util.*;
class Day3Uppercase
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = xyz.nextLine();
		
		boolean flag = true;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				flag = false;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Only Uppercase Letter");
		}
		else
		{
			System.out.println("not Uppercase letter");
		}
	}
}