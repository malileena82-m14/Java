/*Question 29: Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                For first 50 units Rs. 0.50/unit
                For next 100 units Rs. 0.75/unit
                For next 150 units Rs. 1.20/unit
                For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
Input:
Units = 300

Output:
Total Electricity Bill = Calculated Amount

Explanation:
First 50 units ? 50 × 0.50
Next 100 units ? 100 × 0.75
Next 150 units ? 150 × 1.20
Remaining units ? 50 × 1.50
Total amount is calculated and then 20% surcharge is added.*/

import java.util.*;
class Electricity
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the units");
		
		int u = xyz.nextInt();//400
		double bill = 0 ;
		
		if(u<=50)//300<=50
		{
			bill = u*0.50;
		}
		else if(u<=150)//60
		{
			bill = 50*0.50;//50
			u=u-50;//10
			bill=bill+u*0.75;			
		}
		else if(u<=300)//210
		{
			bill=50*0.50;//50
			u=u-50;//160
			bill=bill+150*0.75;//150
			u=u-150;//10
			bill=bill+u*1.20;
			
		}
		else
		{
		    bill=50*0.50;//50
			u=u-50;//350
			bill=bill+150*0.75;//150
			u=u-150;//200
			bill=bill+150*1.20;	//150
			u=u-150;//50
			bill=bill+u*1.50;
		}
		System.out.println("bill="+bill);
		bill=bill+(bill*20/100);
		System.out.println("Total bill="+bill);
		
	}
}
