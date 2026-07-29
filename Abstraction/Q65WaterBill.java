/*Question 65: Create abstract class WaterBill.
Asked In Practice Question
Abstract method calculateBill().
Subclasses:

Residential

Industrial

Input
Units: 50
Rate: 3
Output
Bill: 150*/

import java.util.*;
abstract class WaterBill
{
	int units;
	int rate;
	WaterBill(int units,int rate)
	{
		this.units = units;
		this.rate = rate;
	}
	abstract void calculateBill();
}
class Residential extends WaterBill
{
	Residential(int units,int rate)
	{
		super(units,rate);
	}
	void calculateBill()
	{
		System.out.println("Bill: "+(units*rate));
	}
}
class Industrial extends WaterBill
{
	Industrial(int units,int rate)
	{
		super(units,rate);
	}
	void calculateBill()
	{
		System.out.println("Bill: "+(units*rate));
	}
}
class Q65WaterBill
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Residential");
		System.out.println("2.Industrial");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		WaterBill w;
		
		switch(choice)
		{
			case 1:
				System.out.println("Entere units");
				int units = xyz.nextInt();
				System.out.println("Enter rate");
				int rate = xyz.nextInt();
				w = new Residential(units,rate);
				w.calculateBill();
				break;
				
			case 2:
				System.out.println("Entere units");
				int units1 = xyz.nextInt();
				System.out.println("Enter rate");
				int rate1 = xyz.nextInt();
				w = new Residential(units1,rate1);
				w.calculateBill();
				break;
				
			default:
				System.out.println("Wrong Choice");
		}
	}
}