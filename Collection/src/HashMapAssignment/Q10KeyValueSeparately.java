/*Q10. Display Keys and Values Separately
Question
Create a Map of student IDs and names. Display all keys and values separately.
Explanation
Use keySet() to retrieve keys and values() to retrieve values.
Input
101 = Rahul
102 = Amit
103 = Priya
Output
Keys:
101
102
103

Values:
Rahul
Amit
Priya*/

package HashMapAssignment;
import java.util.*;
public class Q10KeyValueSeparately {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Rahul");
		map.put(102, "Amit");
		map.put(103, "Priya");
		System.out.println("Keys: ");
		for(Integer key:map.keySet())
		{
			System.out.println(key);
		}
		System.out.println("Values: ");
		for(String value:map.values())
		{
			System.out.println(value);
		}
	}

}
