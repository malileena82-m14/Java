/*2. Merge Two Sorted ArrayLists
Difficulty: Easy–Medium
Problem Statement
Given two sorted ArrayList<Integer> objects, merge them into a single sorted ArrayList without using any built-in sorting method.
Example
Input:
List1 = [1, 3, 5]
List2 = [2, 4, 6]

Output:
[1, 2, 3, 4, 5, 6] */

package StudyPlanDay1;
import java.util.*;
public class MergeTwoSorted {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter size of List1");
		int n = xyz.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int value = xyz.nextInt();
			al.add(value);
		}
		System.out.println("List 1 = "+al);
		
		ArrayList<Integer> al1 = new ArrayList<>();
		System.out.println("Enter size of List2");
		int n1 = xyz.nextInt();
		
		for(int i=0;i<n1;i++)
		{
			int value = xyz.nextInt();
			al1.add(value);
		}
		System.out.println("List 2 = "+al1);
		
		al.addAll(al1);
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				Integer prev=al.get(i);
				Integer next=al.get(j);
				if(prev > next)
				{
					al.set(i, next);
					al.set(j, prev);
				}
			}
		}
		System.out.println("Merge Sorting Array");
		for(Object obj:al)
		{
			System.out.print(obj +"\t");
		}
	}

}
