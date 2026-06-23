/*23. Check whether a string contains only digits*/

import java.util.*;
class Day3Digit
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
			if(!(ch>='0' && ch<='9'))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Only Digit");
		}
		else
		{
			System.out.println("not only digit");
		}
	}
}