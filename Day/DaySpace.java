/*14. Remove all white spaces from a string.*/

import java.util.*;
class DaySpace
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
			if(ch!=' ')
			{
				result = result+ch;
			}
		}
		System.out.println("After the remove Space :"+result);
	}
}