/*
Q23. Write a java program to print this pattern.   
#  
# *  
# * #  
# * # *  
# * # * #  
# * # *  
# * #   
# *  
#  

*/

class pattern23
{
	public static void main(String x[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j%2!=0 && i-j>=0)
				{
					System.out.print("# ");
				}
				else if(j%2==0)
				{
					System.out.print("* ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}