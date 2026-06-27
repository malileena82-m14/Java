/*34. Convert the first character to uppercase.*/

import java.util.*;
class Day4Uppercase
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = xyz.nextLine();
		
	    char ch[] = str.toCharArray();
		if(ch[0]>='a' && ch[0]<='z')
		{
			ch[0] = (char)(ch[0]-32);
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
	}
}