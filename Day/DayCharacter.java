/*11. Count the occurrences of a particular character.*/

import java.util.*;
class DayCharacter
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.nextLine();
		System.out.println("Enter the character");
		char target = xyz.next().charAt(0);
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch==target)
			{
			    count++;
			}
		}
		System.out.println("Occurrences = "+count);
	}
}