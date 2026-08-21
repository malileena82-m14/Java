/*4. Reverse a LinkedList
Difficulty: Easy
Problem Statement
Given a LinkedList<Integer>, reverse the order of all elements without creating another LinkedList.
Example
Input: [10, 20, 30, 40]
Output: [40, 30, 20, 10]*/

package StudyPlanDay1;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		LinkedList<Integer> li =  new LinkedList<>();
		System.out.println("Enter number");
		int n = xyz.nextInt();
		for(int i=0;i<n;i++)
		{
			int value = xyz.nextInt();
			li.addFirst(value);
		}
		System.out.println("Output: "+li);

	}

}
