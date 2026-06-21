/*Example: WAP to create a 3 x 3 matrix and calculate the sum of every row*/

import java.util.*;
class Matrix
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the values matrix");
		int a[][] = new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("Display Matrix");
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum = sum+a[i][j];
				System.out.print(" "+a[i][j]);
			}
			System.out.println("Sum ="+sum);
		}
	}
}