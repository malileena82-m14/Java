/*Q9. You are given an integer array containing zero and non-zero values. Move all zero values to 
the end of the array while maintaining the original order of non-zero elements. 
Description: 
Use two pointers: 
• One pointer tracks the position for next non-zero element.  
• Another pointer scans the array. 
Place non-zero elements first and fill remaining positions with zeros.  
Input: 
arr = [0,1,0,3,12] 
Output: 
[1,3,12,0,0] 
Time Complexity: 
O(n) */
import java.util.*;
class Q9
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size");
		
		int size = xyz.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the Array");
		
		for(int i=0;i<size;i++)
		{
			a[i] = xyz.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=j+1;j<size-1;j++)
			{
				if(a[i]!=0)
				{
					a[i]=a[j];
				}
				System.in.out.println(" "+a[i]);
			}
		}
	}
}