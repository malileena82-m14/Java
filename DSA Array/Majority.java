/*Question 23: Write a Java program to find the Majority Element of an array.
A majority element in an array of size n is an element that appears more than n/2 times. 
There can be at most one majority element in the array.
Input:
Array = [4, 8, 4, 6, 7, 4, 4, 8]

Output:
Majority Element = 4

Explanation:
Count the occurrences of every element using nested traversal and if any element appears more than n/2 
times it is the majority element.*/
import java.util.*;
class Majority
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = xyz.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the Array");
		for(int i=0;i<size;i++)
		{
			a[i]= xyz.nextInt();
		}
		boolean found=false;
		int count=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>size/2)
			{
				System.out.println("Majority Number = "+a[i]);
				found = true;
				break;
			}
		}
	}
}
