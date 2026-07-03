/*5. Count the number of digits in a string.*/

import java.util.*;
class DayDigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		
		String str = xyz.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				count++;
			}
		}
		System.out.println("Number of digits = "+count);
	}
}