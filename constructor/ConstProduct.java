/*Question 4: Write a Java program to create a Product class and check whether product price is expensive or affordable.

Description: Create Product POJO class with productId, productName and price. Use constructor to initialize values. 
If price > 1000 print Expensive otherwise Affordable.
INPUT:
Enter Product Id: 501
Enter Product Name: Headphones
Enter Price: 1200

OUTPUT:
Product Name: Headphones
Category: Expensive Product

EXPLANATION:
Create Product class with fields productId, productName, price. Use constructor public Product(int id, String name, int p) 
to initialize. In constructor or display method, check if price > 1000 then print "Expensive Product" else "Affordable Product". 
Display product name and category.*/

import java.util.*;
class Product
{
	int id;
	String name;
	int price;
	
	Product(int id,String name,int price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	void display()
	{
		System.out.println("Product Name :"+name);
		
		if(price>1000)
		{
			System.out.println("Category: Expensive Product");
		}
		else
		{
			System.out.println("Category: Affordable Product");
		}
	}
}
class ConstProduct
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter Product Id :");
		int id = xyz.nextInt();
		xyz.nextLine();
		
		System.out.println("Enter Product Name :");
		String name = xyz.nextLine();
		
		System.out.println("Enter Price :");
		int price = xyz.nextInt();
		
		Product p = new Product(id,name,price);
		p.display();
	}

}