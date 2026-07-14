/*Question 31: Create a base class Product with attributes name and price.
Use this keyword inside constructor to assign values.

Create a child class Inventory that adds quantity.
Use this() and super() for constructor chaining.

Store 3 products using array and calculate total stock value.
Asked In Practice Assignment
Description
Shows how this is used to differentiate instance variables
from parameters and perform calculations.
Input
Enter number of Products: 3

Enter Name: Pen
Enter Price: 10
Enter Quantity: 5

Enter Name: Book
Enter Price: 50
Enter Quantity: 3

Enter Name: Bag
Enter Price: 500
Enter Quantity: 2
Output
Product: Pen, Total Value: 50
Product: Book, Total Value: 150
Product: Bag, Total Value: 1000*/

import java.util.*;
class Product
{
	String name;
	int price;
	Product(String name,int price)
	{
		this.name = name;
		this.price = price;
	}
}
class Inventory extends Product
{
	int quantity;
	Inventory(String name,int price,int quantity)
	{
		super(name,price);
		this.quantity = quantity;
	}
	void show()
	{
		System.out.println("Product: "+name+", Total Value: "+(price*quantity));
	}
}
class Q31Product
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of Products");
		int num = xyz.nextInt();
		
		Inventory a[] = new Inventory[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Name");
			String name = xyz.next();
			System.out.println("Enter Price");
			int price = xyz.nextInt();
			System.out.println("Enter Quantity");
			int quantity = xyz.nextInt();
			
			a[i] = new Inventory(name,price,quantity);
		}
		for(int i=0;i<num;i++)
		{
			a[i].show();
		}
	}
}

