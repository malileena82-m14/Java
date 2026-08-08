/*Question 80: Create abstract class Bill.
Asked In Practice Question
Abstract method generateBill().
Subclasses:

DineIn

TakeAway

Input
Amount: 1000
Output
Bill Amount: 1000*/
import java.util.*;
abstract class Bill
{
	int amt;
	Bill(int amt)
	{
		this.amt = amt;
	}
	abstract void generateBill();
}
class DineIn extends Bill
{
	DineIn(int amt)
	{
		super(amt);
	}
	void generateBill()
	{
		System.out.println("Bill Amount: "+amt);
	}
}
class TakeAway extends Bill
{
	TakeAway(int amt)
	{
		super(amt);
	}
	void generateBill()
	{
		System.out.println("Bill Amount: "+amt);
	}
}
class Q80Bill
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.DineIn");
		System.out.println("2.TakeAway");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Bill b;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Amount");
				int amt = xyz.nextInt();
				b = new DineIn(amt);
				b.generateBill();
				break;
				
			case 2:
				System.out.println("Enter Amount");
				int amt1 = xyz.nextInt();
				b = new TakeAway(amt1);
				b.generateBill();
				break;
				
			default:
				System.out.println("Invalid Choice");
		}
	}
}