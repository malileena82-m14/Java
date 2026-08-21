/*Q9. Remove an Entry
Question
Create a Map containing product IDs and product names. Remove a product based on its ID.
Explanation
Use the remove() method with the required key.
Input
101 = Laptop
102 = Mouse
103 = Keyboard

Remove: 102
Output
101 = Laptop
103 = Keyboard*/

package HashMapAssignment;
import java.util.*;
public class Q9Remove {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Laptop");
		map.put(102, "Mouse");
		map.put(103, "Keyboard");
		
		map.remove(102);
		
		for(Map.Entry<Integer, String>m:map.entrySet())
		{
			System.out.println(m.getKey()+" = "+m.getValue());
		}
	}

}
