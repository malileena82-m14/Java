/*5. Convert Lowercase to Uppercase (No LeetCode) 
Given a string containing lowercase letters, convert all characters into uppercase and return the 
updated string. 
Example: Input: "world" → Output: "WORLD"*/

import java.util.*;
class LowercaseDaily
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.nextLine();
		
		str = str.toUpperCase();
		System.out.println(str);
	}
}