/*Q3.  Write a java program to display 1 to nth Armstrong Number.*/
import java.util.*;
class Q3
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int n = xyz.nextInt();
		int temp = n;
		int sum = 0;
		int count = String.valueOf(n).length();//153.length(3)
		
		while(n>0)
		{
			int digit = n%10; //153%10=3  15%10=5  1%10=1
			sum = sum+d*d*d;// 0+27 , 27+125, 152+1
													
			n = n/10;
		}
		if(sum==temp)// 153==153 then execute the condition and print the statement
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}
}