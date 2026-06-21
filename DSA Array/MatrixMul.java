import java.util.*;
class MatrixMul
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int [][]a = new int[3][3];
		int [][]b = new int[3][3];
		int [][]c = new int[3][3];
		
		System.out.println("Enter the Array1");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("Enter the Array2");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j] = xyz.nextInt();
			}
		}
		System.out.println("Multification");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				int sum=0;
				for(int k=0;k<a.length;k++)
				{
					sum = a[i][k]+b[k][j];
				}
				c[i][j]=sum;
			}
		}
		System.out.println("Matrix 1 is");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;i++)
			{
				System.out.println("\t"+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matrix 2 is");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.println("\t"+b[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matrix Multification is ");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.println("\t"+c[i][j]);
			}
			System.out.println();
		}
	}
}