/*Question 100: Abstract class Order.
Asked In Practice Assignment
Store products in array.
price * quantity
Sum total

Input:
2
Product1 100 2
Product2 200 1

Output:
Total Amount: 400*/

import java.util.*;
abstract class Order
{
	
}
class Product extends Order
{
	private String name;
	private int price;
	private int quantity;
	
	Product(String name,int price,int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setQuantity()
	{
		this.quantity = quantity;
	}
	public int getQuantity()
	{
		return quantity;
	}
	void calculate()
	{
		System.out.println(price*quantity);
	}
}
class Q100Order
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input");
		int n = xyz.nextInt();
		
		Product a[] = new Product[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Product name");
			String name = xyz.next();
			
			System.out.println("Enter Price");
			int price = xyz.nextInt();
			
			System.out.println("Enter Quantity");
			int quantity = xyz.nextInt();
			
			a[i] = new Product(name,price,quantity);
		}
		int total = 0;
        for(int i = 0; i < n; i++)
        {
            total = total + (a[i].getPrice() * a[i].getQuantity());
        }

        System.out.println("Total Bill: " + total);		
	}
}