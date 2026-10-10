/*Q7. Write a java program to print this pattern.   
* * * * *  
 * * * *   
  * * *    
   * *     
    *  
*/

class Q7Pattern
{
	public static void main(String x[])
	{	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}