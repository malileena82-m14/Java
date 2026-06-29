/*Count all palindromic substrings.*/

import java.util.*;
class Day7Palindrome
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.next();
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				String sub = str.substring(i,j);
				String rev = "";
				for(int k=sub.length()-1;k>=0;k--)
				{
					rev = rev + sub.charAt(k);
				}
				if(sub.equals(rev))
		        {  
			      count++;
				  System.out.println(sub);
		     	}
		    }
		
		}
		System.out.println("Palindromic substring :"+count);
	}
}