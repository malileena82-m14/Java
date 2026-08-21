/*5. Find the Middle Element
Difficulty: Medium
Problem Statement
Given a LinkedList<Integer>, find and print its middle element. If the list has an even number of elements, print the second middle element.
Example
Input: [1, 2, 3, 4, 5, 6]
Output: 4*/

package StudyPlanDay1;
import java.util.*;
public class MiddleElement {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		LinkedList<Integer> li = new LinkedList<>();
		
		System.out.println("Enter elements");
		int n = xyz.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int value = xyz.nextInt();
			li.add(value);
		}
		int mid = li.size()/2;
		System.out.println(li.get(mid));
	}
}
