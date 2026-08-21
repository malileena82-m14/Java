/*1. Remove Duplicates from an ArrayList
Difficulty: Easy
Problem Statement
Given an ArrayList<Integer> containing duplicate elements, remove all duplicate values while preserving the order of their first occurrence.
Example
Input:
[10, 20, 10, 30, 20, 40]

Output:
[10, 20, 30, 40]*/

package StudyPlanDay1;
import java.util.*;
public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(20);
		
		ArrayList<Integer> al1 = new ArrayList<>();
		for(Object obj:al)
		{
			if(!al1.contains(obj))
			{
				al1.add((Integer) obj);
			}
		}
		System.out.println(al1);
	}

}
