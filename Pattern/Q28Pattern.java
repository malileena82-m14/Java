/*
Q28. Write a java program to print this pattern.      
        *     
      *   *    
    *   *   *   
  *   *   *   *  
*   *   *   *   *   
  *   *   *   *    
    *   *   *     
      *   *      
        * 

*/

class Q28Pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i+j>=6 && i-j>=-4 && i-j<=4 && i+j<=14 && (i+j)%2==0)
				{
					System.out.print("* ");
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