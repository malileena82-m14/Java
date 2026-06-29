/*24. Check whether a string contains only alphabets.*/

import java.util.*;
class Day3Alphabet
{
	public static void main(String x[])
	{
		Scanner xyz =  new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.nextLine();
		
		boolean flag = true;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(!((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Alphabet only");
		}
		else
		{
			System.out.println("not alghatbet");
		}
	}
}