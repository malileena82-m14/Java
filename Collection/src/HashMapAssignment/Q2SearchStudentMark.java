/*Q2. Search Student Marks
Question
Create a Map containing student names and marks. Accept a student name and display the marks if the student exists.
Explanation
Use containsKey() or get() to search for a particular student.
Input
Map:
Rahul = 85
Amit = 72
Priya = 91

Search: Priya
Output
Priya's Marks = 91*/

package HashMapAssignment;
import java.util.*;

public class Q2SearchStudentMark {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		System.out.println("Enter number of Students");
		int n = xyz.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student name");
			String name = xyz.next();
			
			System.out.println("Enter Marks");
			int marks = xyz.nextInt();
			
			map.put(name, marks);
			
		}
		System.out.println("Search key");
		String s = xyz.next();
		if(map.containsKey(s))
		{
			System.out.println(s+"\t"+map.get(s));
		}
	}
	
}

