/*4. Count the number of consonants in a string.*/

import java.util.*;
class DayConsonant
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.nextLine();
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u')
			{
				count++;
			}
		}
		System.out.println("Number of Consonants = "+count);
	}
}