/*22. Find the smallest character in a string.*/

import java.util.*;
class DaySmallest
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = xyz.nextLine();
		
		char Smallest = str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch<Smallest)
			{
				Smallest = ch;
			}
		}
		System.out.println("Smallest Character :"+Smallest);
	}
}