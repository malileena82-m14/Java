/*Question 38: Create a base class Payment with method pay().
Create child classes CashPayment and CardPayment that override pay().
Use parent reference to call methods.
Asked In Practice Assignment
Description
Demonstrates runtime polymorphism using parent reference
Input
No input required
Output
Payment by Cash
Payment by Card*/

class Payment
{
	void pay()
	{
		
	}
}
class CashPayment extends Payment
{
	void pay()
	{
		System.out.println("Payment by Cash");
	}
}
class CardPayment extends Payment
{
	void pay()
	{
		System.out.println("Payment by Card");
	}
}
class Q38Payment
{
	public static void main(String x[])
	{
		Payment p;
		
		p = new CashPayment();
		p.pay();
		
		p = new CardPayment();
		p.pay();
	}
}
