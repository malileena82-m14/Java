/*21. Find the largest character in a string.*/

import java.util.*;
class DayLargest
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = xyz.nextLine();
		char Largest = str.charAt(0);
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>Largest)
			{
				Largest = ch;
			}
		}
		System.out.println("Largest character : "+Largest);
	}
}