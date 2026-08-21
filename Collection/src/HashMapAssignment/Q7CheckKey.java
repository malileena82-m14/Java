/*Q7. Check Key Existence
Question
Create a Map of country and capital names. Check whether a particular country exists in the Map.
Explanation
Use containsKey() to check whether the given country is available.
Input
India = Delhi
Japan = Tokyo
France = Paris

Search: India
Output
India is present in the Map.*/

package HashMapAssignment;
import java.util.*;
public class Q7CheckKey {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		map.put("France", "Paris");
		
		System.out.println("Enter search Key");
		String str = xyz.next();
		boolean flag = false;
		for(Map.Entry<String, String> m:map.entrySet())
		{
			if(m.getKey().equals(str))
			{
				flag = true;
				System.out.println(str+" is present in the Map");
				break;
			}
		}
		if(!flag)
		{
			System.out.println("map is not found");
		}
	}

}
