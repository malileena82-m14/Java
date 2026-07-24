/*Question 46: Create an abstract class Payment to process different payment methods.
Asked In Practice Question
Create abstract class Payment with:

Abstract method payAmount()

Create subclasses:

CreditCardPayment

UPIPayment

Each subclass should display payment mode and amount paid.

Input
Payment Method: UPI
Amount: 2000
Output
Payment done using UPI
Amount Paid: 2000*/

import java.util.*;
abstract class Payment
{
	int amount;
	Payment(int amount)
	{
		this.amount = amount;
	}
	abstract void payAmount();
}
class CreditCardPayment extends Payment
{
	CreditCardPayment(int amount)
	{
		super(amount);
	}
	void payAmount()
	{
		System.out.println("Payment done using credit card");
		System.out.println("Amount paid: "+amount);
	}
}
class UPIPayment extends Payment
{
	UPIPayment(int amount)
	{
		super(amount);
	}
	void payAmount()
	{
		System.out.println("Payment done using UPI");
		System.out.println("Amount paid: "+ amount);
	}
}
class Q46Payment
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Payment Method");
		String m = xyz.nextLine();
	
		System.out.println("Amount");
		int amount = xyz.nextInt();
		
		Payment p;
		
		if(m.equalsIgnoreCase("CreditCardPayment"))
		{
			p = new CreditCardPayment(amount);
			p.payAmount();
		}
		else
		{
			p = new UPIPayment(amount);
			p.payAmount();
		}
	}
}