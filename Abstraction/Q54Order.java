/*Question 54: Create abstract class Order.
Asked In Practice Question
Abstract method processOrder().
Subclasses:

FoodOrder

GroceryOrder

Input
Order Type: Food
Amount: 500
Output
Food Order Processed
Amount: 500*/

import java.util.*;
abstract class Order
{
	int amount;
	Order(int amount)
	{
		this.amount = amount;
	}
	abstract void processOrder();
}
class FoodOrder extends Order
{
	FoodOrder(int amount)
	{
		super(amount);
	}
	void processOrder()
	{
		System.out.println("Food Order Processed");
		System.out.println("Amount: "+amount);
	}
}
class GroceryOrder extends Order
{
	GroceryOrder(int amount)
	{
		super(amount);
	}
	void processOrder()
	{
		System.out.println("Grocery Order Processed");
		System.out.println("Amount: "+amount);
	}
}
class Q54Order
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Food Order");
		System.out.println("2.Grocery Order");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Order o;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter amount");
				int amount = xyz.nextInt();
				o = new FoodOrder(amount);
				o.processOrder();
				break;
				
			case 2:
				System.out.println("Enter amount");
				int amount1 = xyz.nextInt();
				o = new GroceryOrder(amount1);
				o.processOrder();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}