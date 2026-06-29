/*63.Replace all occurrences of one substring with another.*/

import java.util.*;
class Day7SubString
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = xyz.nextLine();
		
		System.out.println("Enter the old Substring");
		String oldSub = xyz.nextLine();
		
		System.out.println("Enter the New SubString");
		String newSub = xyz.nextLine();
		
		String result = "";
		
		for(int i = 0; i < str.length();)
        {
            if(i <= str.length() - oldSub.length() &&
               str.substring(i, i + oldSub.length()).equals(oldSub))
            {
                result = result + newSub;
                i = i + oldSub.length();
            }
            else
            {
                result = result + str.charAt(i);
                i++;
            }
        }
        System.out.println("After Replacement : " + result);
	}
}