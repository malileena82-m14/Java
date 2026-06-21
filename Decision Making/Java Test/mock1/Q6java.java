/*Q6. Calculate commission based on sales amount: 
• Input: Sales amount 
• Logic: 
o Sales < 5000 → 2% commission 
o Sales 5000–10000 → 5% commission 
o Sales > 10000 → 10% commission 
• Output: Display commission amount.*/

import java.util.*;
class Q6java
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the amount");
		
		int s = xyz.nextInt(); //1300
		
		if(s<5000) //condition false
		{
			s = (s*2)/100;
		}
		else if(s<=5000 && s<=10000) //condition false
		{
			s = (s*5)/100;
		}
		else if(s>10000) //condition true
		{
			s = (s*10)/100; // (13000*10)/100 = 1300
		}
		System.out.println("Commission Amount = "+ s);//1300
	}
	
}