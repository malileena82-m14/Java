/*Question 43: Mobile plan billing system:
? Input: Minutes used in a month
? Logic:
? Up to 100 mins ? Base ?199
? 101–300 mins ? ?199 + ?1/min for extra
? 301–500 mins ? ?199 + ?1.5/min for extra
? Above 500 mins ? ?199 + ?2/min for extra
? Output: Total monthly bill.
Input
Minutes Used = 350

Logic
Up to 100 mins ? ?199

101–300 mins ? ?199 + ?1 per extra minute

301–500 mins ? ?199 + ?1.5 per extra minute

Above 500 mins ? ?199 + ?2 per extra minute

Output
Total Bill = ?574

Explanation
Extra minutes = 350 ? 100 = 250
Since usage is in 301–500 range:
Extra charge = 250 × 1.5 = 375
Total Bill = 199 + 375 = 574*/

import java.util.*;
class Bill
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Minutes Used");
		
		int minute = xyz.nextInt();
		double Total=0;
		double charge;
		
		if(minute<=100)
		{
			System.out.println("No extra charge");
		}
		else if(minute>=101 && minute<=300)
		{
			minute = minute - 100;
			charge = minute*1;
			Total  = 199 + charge;
		}
		else if(minute>=301 && minute<=500)
		{
			minute = minute - 100;
			charge = minute*1.5;
			Total  = 199 + charge;
		}
		else
		{
			minute = minute - 100;
			charge = minute*2;
			Total  = 199 + charge;
		}
		
		System.out.println("Total Bill = " + Total);
	}
}