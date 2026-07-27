/*Question 51: Create abstract class Product.
Asked In Practice Question
Abstract method applyDiscount().
Subclasses:

Electronics

Clothing

Apply different discounts.

Input
Type: Electronics
Price: 10000
Discount: 10%
Output
Final Price: 9000*/

import java.util.*;
abstract class Product
{
	int price;
	int discounts;
	
	Product(int price,int discounts)
	{
		this.price = price;
		this.discounts = discounts;
	}
	abstract void applyDiscount();
}
class Electronics extends Product
{
	Electronics(int price,int discounts)
	{
		super(price,discounts);
	}
	void applyDiscount()
	{
		int fp = (price*discounts)/100;
		fp = price - fp;
		System.out.println("Final Price: "+ fp);
	}
}
class Clothing extends Product
{
	Clothing(int price,int discounts)
	{
		super(price,discounts);
	}
	void applyDiscount()
	{
		int fp = (price*discounts)/100;
		fp = price - fp;
		System.out.println("Final Price: "+fp);
	}
}
class Q51Product
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Electronics");
		System.out.println("2.Clothing");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		Product p;
		
		switch(choice)
		{
			case 1: 
				System.out.println("Enter Price");
				int price = xyz.nextInt();
		
				System.out.println("Enter Discount");
				int discounts = xyz.nextInt();
				p = new Electronics(price,discounts);
				p.applyDiscount();
				break;
				
			case 2:
				System.out.println("Enter Price");
				int price1 = xyz.nextInt();
		
				System.out.println("Enter Discount");
				int discounts1 = xyz.nextInt();
				p = new Clothing(price1,discounts1);
				p.applyDiscount();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}