/*32. Count uppercase and lowercase letters separately.*/

import java.util.*;
class Day4LowerUpper
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = xyz.nextLine();
		int Ucount=0;
		int Lcount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				Ucount++;
			}
			else if(ch>='a' && ch<='z')
			{
				Lcount++;
			}
		}
		System.out.println("Uppercase Count ="+Ucount);
		System.out.println("Lowercase Count ="+Lcount);
	}
	
}