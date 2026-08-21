/*1. Store and Display Student Marks
Question
Create a HashMap to store student names and their marks. Display all student names along with their marks.
Explanation
Use the student name as the key and marks as the value. Iterate through the Map using entrySet().
Input
Rahul 85
Amit 72
Priya 91
Output
Rahul = 85
Amit = 72
Priya = 91*/

package HashMapAssignment;
import java.util.*;
public class Q1Studentdata {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		System.out.println("Enter number of Students");
		int n = xyz.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student Name");
			String name = xyz.next();
			
			System.out.println("Enter Student Marks");
			int marks = xyz.nextInt();
			
			map.put(name,marks);
		}
		for(Map.Entry<String,Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}
}
