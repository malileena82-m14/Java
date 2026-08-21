/*3. Find the Second Largest Element
Difficulty: Medium
Problem Statement
Given an ArrayList<Integer>, find the second largest unique element. If it does not exist, print an appropriate message.
Example
Input:
[12, 45, 67, 45, 89, 89]
Output:
67*/

package StudyPlanDay1;
import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter number of Elements");
		int n = xyz.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int value = xyz.nextInt();
			al.add(value);
		}
		
		int max = 0;
		int sm = 0;
		for(int value :al)
		{
			if(value > max)
			{
				sm = max;
				max = value;
			}
			else if(value > sm && value != 0)
			{
				sm = value;
			}		
		}
		System.out.println("Second Largest element: "+ sm);
	}

}
