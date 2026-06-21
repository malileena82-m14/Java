/*Example: WAP to calculate the sum of left diagonal and right diagonal of matrix*/
import java.util.*;
class Diagonal
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the value matrix");
		
		int a[][] = new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("Display Matrix");
		int Lsum=0,Rsum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					Lsum=Lsum+a[i][j];
				}
				if(j==2-i)
				{
					Rsum=Rsum+a[i][j];
				}
				System.out.print(" "+a[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("Left Diagonal = "+Lsum);
		System.out.println("Right Diagonal = "+Rsum);
	}
}