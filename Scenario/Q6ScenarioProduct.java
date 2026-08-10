/*6. Online Shopping Application
An e-commerce company wants to manage different product categories.
Requirements:
•	Create a superclass Product. 
•	Create subclasses Electronics, Clothing, and Books. 
•	Each product calculates discounts differently. 
•	All products support return and exchange policies. 
•	Product ID should remain constant. 
•	Use the parent constructor to initialize common product details. 
•	Customers should purchase products using a common Product reference. 
•	The company tax calculation method should not be overridden. 
•	Create a utility class containing helper methods and demonstrate method hiding by creating a child utility class with a 
	static method having the same name. 
Implement using:
•	Inheritance 
•	Abstract Class 
•	Interface 
•	Method Overriding 
•	Dynamic Polymorphism 
•	super() Constructor 
•	final Keyword 
•	Loose Coupling 
•	Method Hiding (Static Methods)*/

import java.util.*;
interface ReturnPolicy
{
	void returnPolicy();
}
abstract class Product implements ReturnPolicy
{
	int productId;
	String productName;
	double price;
	Product(int productId,String productName,double price)
	{
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	void display()
	{
		System.out.println("Product Id: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Price: "+price);
	}
	abstract void calculateDiscount();
	final void tax()
	{
		System.out.println("Company Tax Applied");
	}
}
class Electronics extends Product
{
	Electronics(int productId,String productName,double price)
	{
		super(productId,productName,price);
	}
	void calculateDiscount()
	{
		double discount = price * 0.10;
        System.out.println("Discount : " + discount);
	}
	public void returnPolicy()
	{
		 System.out.println("Return and Exchange Available");
	}
}
class Clothing extends Product
{
	Clothing(int productId,String productName,double price)
	{
		super(productId,productName,price);
	}
	void calculateDiscount()
	{
		double discount = price * 0.20;
        System.out.println("Discount : " + discount);
	}
	public void returnPolicy()
	{
		 System.out.println("Return and Exchange Available");
	}
}
class Books extends Product
{
	Books(int productId,String productName,double price)
	{
		super(productId,productName,price);
	}
	void calculateDiscount()
	{
		double discount = price * 0.30;
        System.out.println("Discount : " + discount);
	}
	public void returnPolicy()
	{
		 System.out.println("Return and Exchange Available");
	}
	
}
class Utility
{
	static void helper()
	{
		System.out.println("Parent Utility class");
	}
}
class childUtility extends Utility
{
	static void helper()
	{
		System.out.println("Child Utility class");
	}
}
class Q6ScenarioProduct
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Electronics");
		System.out.println("2.Clothing");
		System.out.println("3.Books");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Product p;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Product Id");
				int productId = xyz.nextInt();
				System.out.println("Enter Product Name");
				String productName = xyz.next();
				System.out.println("Enter Product Price");
				double price = xyz.nextDouble();
				p = new Electronics(productId,productName,price);
				p.display();
				p.calculateDiscount();
				p.returnPolicy();
				p.tax();
				Utility.helper();
				childUtility.helper();
				break;
				
			case 2:
				System.out.println("Enter Product Id");
				int productId1 = xyz.nextInt();
				System.out.println("Enter Product Name");
				String productName1 = xyz.next();
				System.out.println("Enter Product Price");
				double price1 = xyz.nextDouble();
				p = new Clothing(productId1,productName1,price1);
				p.display();
				p.calculateDiscount();
				p.returnPolicy();
				p.tax();
				Utility.helper();
				childUtility.helper();
				break;
				
			case 3:
				System.out.println("Enter Product Id");
				int productId2 = xyz.nextInt();
				System.out.println("Enter Product Name");
				String productName2 = xyz.next();
				System.out.println("Enter Product Price");
				double price2 = xyz.nextDouble();
				p = new Books(productId2,productName2,price2);
				p.display();
				p.calculateDiscount();
				p.returnPolicy();
				p.tax();
				Utility.helper();
				childUtility.helper();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
		
	}
}