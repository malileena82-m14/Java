/*Q27. Write a java program to print this pattern. 
 *
 * *
 * * *
 *
 * *
 * * *

*/


class Q27Pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i-j>=0 && i<=3)
				{
					System.out.print(" *");
				}
				else if(i>3 && i-j>=3 )
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}	 	