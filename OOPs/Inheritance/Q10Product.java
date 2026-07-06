/*Question 10: Create a base class Product with attributes name and price.
Create a child class DiscountProduct that adds discount.
Store 3 products using an array of objects and calculate final price after discount.
Asked In Practice Assignment
Description
This program uses inheritance to apply business logic (discount calculation)
and handles multiple objects using arrays.

Input
Enter number of Products: 3

Enter Name: Laptop
Enter Price: 50000
Enter Discount: 5000

Enter Name: Mobile
Enter Price: 20000
Enter Discount: 2000

Enter Name: Tablet
Enter Price: 15000
Enter Discount: 1500
Output
Product: Laptop, Final Price: 45000
Product: Mobile, Final Price: 18000
Product: Tablet, Final Price: 13500*/

import java.util.*;
class Product
{
	String name;
	int price;
}
class DiscountProduct extends Product
{
	int discount;
	void setData(String name,int price,int discount)
	{
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	void display()
	{
		System.out.println("Product: "+name+ "Final Price: "+(price-discount));
	}
}
class Q10Product
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of Products");
		int num = xyz.nextInt();
		
		DiscountProduct a[] = new DiscountProduct[num];
		
		for(int i=0;i<num;i++)
		{
			a[i] = new DiscountProduct();
			
			System.out.println("Enter Name");
			String name = xyz.next();
			
			System.out.println("Enter the Price");
			int price = xyz.nextInt();
			
			System.out.println("Enter the Discount");
			int discount = xyz.nextInt();
			
			a[i].setData(name,price,discount);
		}
		for(int i=0;i<num;i++)
		{
			a[i].display();
		}
	}
}