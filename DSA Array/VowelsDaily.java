/*3. Count Vowels and Consonants (No LeetCode) 
Given a string, count the total number of vowels and consonants present in it. Consider only 
alphabetic characters while performing the count. 
Example: Input: "apple" → Output: Vowels = 2, Consonants = 3*/

import java.util.*;
class VowelsDaily
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = xyz.nextLine();
		int vowel =0;
		int consonant=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=Character.toLowerCase(str.charAt(i));
			if(ch>='a' && ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowel++;
				}
				else
				{
					consonant++;
				}
			}
		}
		System.out.println("Vowels ="+vowel);
		System.out.println("Constant ="+consonant);
	}
}