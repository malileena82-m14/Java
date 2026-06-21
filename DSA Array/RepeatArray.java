/*Question 34: Return the first element that repeats in the array.
Input:
Array = [10, 5, 3, 4, 3, 5, 6]

Output:
First repeating element = 5

Explanation:
Check elements from left to right and identify the element whose first occurrence appears earlier but 
repeats later in the array.*/
import java.util.*;
class RepeatArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[] = new int[7];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("First repeating element =");
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(" "+a[i]);
					flag = true;
					break;
				}
			}
			if(flag)
				break;
		}
	}
}