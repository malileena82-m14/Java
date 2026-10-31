/*6. Check Whether a LinkedList is a Palindrome
Difficulty: Medium
Problem Statement 
Given a LinkedList<Character>, determine whether it reads the same from left to right and right to left.
Example
Input: [R, A, D, A, R]
Output: Palindrome*/

package StudyPlanDay1;
import java.util.*;
public class Palindrome {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		System.out.println("Enter String");
		String s = xyz.nextLine();
		
		String arr[] = s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			String str = arr[i];
			if(map.containsKey(str))
			{
				map.put(str, map.get(str)+1);
			}
			else
			{
				map.put(str, 1);
			}
		}
		
		for(Map.Entry<String, Integer>m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
