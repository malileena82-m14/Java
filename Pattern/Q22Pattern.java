/*
Q22. Write a java program to print this pattern.   
*   *   *   *   *       
  *           *   
    *       *        
      *   *    
		*   
*/

class Q22Pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if((i==1 && j%2!=0) || i-j==0 || i+j==10)
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}