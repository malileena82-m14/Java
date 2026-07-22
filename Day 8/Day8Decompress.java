/*76. Decompress a compressed string.*/

import java.util.*;
class Day8Decompress
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input");
		String str = xyz.next();
		
		String result = "";
		
		for(int i=0;i<str.length();i=i+2)
		{
			char ch = str.charAt(i);
			int count = str.charAt(i+1) - '0';
		
			for(int j=1;j<=count;j++)
			{
				result = result+ch;
			}
		}
		System.out.println("Compressed: "+result);
	}
}