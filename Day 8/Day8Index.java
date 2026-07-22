/*73. Implement your own version of `String.indexOf().*/

import java.util.*;
class Day8Index
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input");
		String str = xyz.next();
		
		System.out.println("Enter character");
		char ch = xyz.next().charAt(0);
		
		int index = -1;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)== ch)
			{
				index = i;
				break;
			}
		}
		System.out.println("Index: "+index);
	}
}