/*
Q15. Write a java program to print this pattern.    
* * * * *   
* # # # *   
* # # # *   
* # # # *   
* * * * * 

*/

class Q15Pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print(" *");
				}
				else if(i==2 || i==3 || i==4 || j==2 || j==3 || j==4)
				{
					System.out.print(" #");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}