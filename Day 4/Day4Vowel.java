/*31. Remove all vowels from a string.*/

import java.util.*;
class Day4Vowel
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
			if(!(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U'))
			{
				result = result + ch;
			}
		}
		System.out.println("After Remove All vowels :"+result);
	}
}