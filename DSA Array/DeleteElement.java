/*Question 10: Write a program in java to delete an element at desired position from an array.
Input the size of array : 5

Input 5 elements in the array in ascending order :
1 2 3 4 5

Input the position where to delete : 3

Expected Output : The new list is : 1 2 3 5*/
import java.util.*;
class DeleteElement
{
	public static void main(String x[])
	{
		Scanner xyz= new Scanner(System.in);
		System.out.println("Enter array size");
		int index = xyz.nextInt();
		int a[] = new int[index];
		
		System.out.println("Enter the Element");
		
		for(int i=0;i<index;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Enter to position delete");
		int pos = xyz.nextInt();
		for(int i=pos-1;i<index-1;i++)
		{
			a[i] = a[i+1];
		}
		System.out.println("The new list is:");
		for(int i=0;i<index-1;i++)
		{
			System.out.println(a[i]+ "");
		}
	}
}