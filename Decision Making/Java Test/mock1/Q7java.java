/*Q7. Mobile plan billing system: 
• Input: Minutes used in a month 
• Logic: 
o Up to 100 mins → Base ₹199 
o 101–300 mins → ₹199 + ₹1/min for extra 
o 301–500 mins → ₹199 + ₹1.5/min for extra 
o Above 500 mins → ₹199 + ₹2/min for extra 
• Output: Total monthly bill.*/

import java.util.*;
class Q7java
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the minutes");
		
		int min = xyz.nextInt(); //300
		double total = 0;
		double charge=0;
		
		if(min<100) //condition false
		{
			System.out.println("No extra charge");
		}
		else if(min>=101 && min<=300) //condition true
		{
			 min   = min - 100; //300-100=200
			charge = min*1;     //200*1  = 200
			total  = 199 + charge;	//199+200=399
		}
		else if(min>=301 && min<=501)
		{
			
			 min   = min - 100;
			charge = min*1.5;
			total  = 199 + charge;	
		}
		else
		{
			
			 min   = min - 100;
			charge = min*2;
			total  = 199 + charge;	
		}
		System.out.println("Total bill = "+ total);
	}
}