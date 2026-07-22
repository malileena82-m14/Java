/*75. Implement string compression (Example: aaabbcc → a3b2c2).*/

import java.util.*;
class Day8Compression
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.next();
		
		String result = "";
		
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}
			else
			{
				result = result + str.charAt(i)+count;
				count =1;
			}
		}
		result = result + str.charAt(str.length()-1) + count;
		System.out.println("Compression: "+result);
		
	}
}