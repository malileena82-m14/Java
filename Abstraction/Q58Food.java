/*Question 58: Create abstract class Food.
Asked In Practice Question
Abstract method calculateBill().
Subclasses:

VegFood

NonVegFood

Input
Type: Veg
Price: 200
Quantity: 2
Output
Total: 400*/

import java.util.*;
abstract class Food
{
	int price;
	int quantity;
	Food(int price,int quantity)
	{
		this.price = price;
		this.quantity = quantity;
	}
	abstract void calculateBill();
}
class VegFood extends Food
{
	VegFood(int price,int quantity)
	{
		super(price,quantity);
	}
	void calculateBill()
	{
		System.out.println("Total: "+(price*quantity));
	}
}
class NonVegFood extends Food
{
	NonVegFood(int price,int quantity)
	{
		super(price,quantity);
	}
	void calculateBill()
	{
		System.out.println("Total: "+(price*quantity));
	}
}
class Q58Food
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.VegFood");
		System.out.println("2.NonVegFood");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Food f;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter price");
				int price = xyz.nextInt();
				System.out.println("Enter quantity");
				int quantity = xyz.nextInt();
				
				f = new VegFood(price,quantity);
				f.calculateBill();
				break;
				
			case 2:
				System.out.println("Enter price");
				int price1 = xyz.nextInt();
				System.out.println("Enter quantity");
				int quantity1 = xyz.nextInt();
				
				f = new NonVegFood(price1,quantity1);
				f.calculateBill();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}