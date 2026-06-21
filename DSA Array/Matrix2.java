import java.util.*;
class Matrix2
{
	public static void main(String x[])
	{
		Scanner xyz= new Scanner(System.in);
		int [][]arr = new int[2][3];
		System.out.println("Enter the Array");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = xyz.nextInt();
			}
		}
		System.out.println("Array is ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
	}
}