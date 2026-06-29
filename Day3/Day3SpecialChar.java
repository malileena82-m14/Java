/*30. Remove all special characters from a string.*/

import java.util.*;
class Day3SpecialChar
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
			if(((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>='0' && ch<='9')))
			{
				result = result+ch;
			}
		}
		System.out.println("After remove all special characters :"+result);
	}
}