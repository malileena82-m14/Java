/*29. Remove all digits from a string.*/

import java.util.*;
class Day3Removedigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = xyz.nextLine();
		String result = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(!(ch>='0' && ch<='9'))
			{
				result = result + ch;
			}
		}
		System.out.println("After Remove all Digits from String : "+result);
	}
}