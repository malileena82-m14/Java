/*Question 47: Pooja would like to withdraw X $US from an ATM. The cash machine will only accept 
the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the 
withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction.
Input
Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
Output the account balance after the attempted transaction, given as a number with two digits of precision. 
If there is not enough money in the account to complete the transaction, output the current bank balance.
Example - Successful Transaction Input:
30 120.00
Output:
89.50
Example - Incorrect Withdrawal Amount (not multiple of 5) Input:
42 120.00
Output:
120.00
Example - Insufficient Funds Input:
300 120.00
Output:
120.00

Explanation
30 is multiple of 5.
Total deduction = 30 + 0.50 = 30.50
Remaining balance = 120 ? 30.50 = 89.50*/
import java.util.*;
class Withdrawal
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		
		int w = xyz.nextInt();
		System.out.println("Enter the Withdrawal");
		double bal = xyz.nextDouble();
		System.out.println("Enter the Balance");
		
		if(w<bal)
		{
			if(w%5==0)
			{
				double Total = w + 0.50;
				double rem = bal - Total;
				System.out.println("Successful Transaction = "+ rem);
			}
			else
			{
				System.out.println("Incorrect Withdrawal Amount = "+ bal);
			}
		}
			else
			{
				System.out.println("Insufficient Fund = "+ bal);
			}
	}
}