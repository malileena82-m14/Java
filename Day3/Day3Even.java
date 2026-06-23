/*27. Print characters at even indexes.*/

import java.util.*;
class Day3Even
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.nextLine();
		
		System.out.println("Even Index : ");
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(i%2==0)
			{
				System.out.println(ch);
			}
		}
	}
}