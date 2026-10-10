/*

Q18. Write a java program to print this pattern.   
*  *  *  *  *   *       
  *  *  *  *  *           
    *  *  *  *        
	 *  *  *    
	   *  *          
	    * 

*/
class Q19Pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==1 || i-j<=0 )
				{
					System.out.print(" *  ");
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