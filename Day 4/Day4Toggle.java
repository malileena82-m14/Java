/*33. Toggle the case of each character.*/

import java.util.*;
class Day4Toggle
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
			if(ch>='a' && ch<='z')
			{
			    ch = (char)(ch-32); 
			}
			else
			{
				ch = (char)(ch+32);
			}
			result = result + ch;
		}
		System.out.println("Toggle case = "+result);
	}
}