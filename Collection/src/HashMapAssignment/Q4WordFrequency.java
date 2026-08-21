/*Q4. Count Word Frequency
Question
Accept a sentence and count the frequency of each word using a HashMap.
Explanation
Split the sentence into words and maintain each word's count in the Map.
Input
java is easy and java is powerful
Output
java = 2
is = 2
easy = 1
and = 1
powerful = 1*/

package HashMapAssignment;
import java.util.*;
public class Q4WordFrequency {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		System.out.println("Enter Input");
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
