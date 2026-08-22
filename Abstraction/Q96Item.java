/*Question 96: Abstract class Item with method totalPrice().
Asked In Practice Assignment
Create Product class with price and quantity.
Store in array
Calculate total bill

Input:

2
100 2
200 3

Output:

Total Bill: 800*/

import java.util.*;
abstract class Item
{
	abstract void totalPrice();
}
class Product extends Item
{
	private int price;
	private int quantity;
	
	Product(int price,int quantity)
	{
		this.price = price;
		this.quantity = quantity;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public int getQuantity()
	{
		return quantity;
	}
	void totalPrice()
	{
		System.out.println(price * quantity));
	}
	
}
class Q96Item
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input");
		int n = xyz.nextInt();
		
		Product a[] = new Product[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter price");
			int price = xyz.nextInt();
			
			System.out.println("Enter quantity");
			int quantity = xyz.nextInt();
			
			a[i] = new Product(price,quantity);
		}
		int total = 0;

        for(int i = 0; i < n; i++)
        {
            total = total + (a[i].getPrice() * a[i].getQuantity());
        }

        System.out.println("Total Bill: " + total);		
	}
}