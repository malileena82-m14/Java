/*74. Implement your own version of `String.substring().*/

import java.util.*;
class Day8SubString
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input");
		String str = xyz.next();
		
		System.out.println("Enter Start index");
		int start = xyz.nextInt();
		
		System.out.println("Enter end index");
		int end = xyz.nextInt();
		
		String result = "" ;
		
		for(int i=start;i<end;i++)
		{
			result = result + str.charAt(i);
		}
		System.out.println("substring: "+result);
	}
}