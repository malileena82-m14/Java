/*Question 6: Write a Java program to implement a Product Discount System.
Create a class Product with attributes productId, name, and price.
Apply discount based on price:
- Price > 5000 => 20% Discount
- Price 2000 to 5000 => 10% Discount
- Price < 2000 => No Discount
Display the final price after discount.
Asked In: Practice assignment
Run
Clear
Input:
Enter Product Id : 101
Enter Product Name : Headphones
Enter Price : 6000

Output:
Product Id : 101
Product Name : Headphones
Original Price : 6000
Discount : 20%
Final Price : 4800

Explanation:
A class Product is created with productId, name, and price.
The discount logic:
- price > 5000 => 20% discount => Final Price = price - (price * 20 / 100)
- price >= 2000 && price <= 5000 => 10% discount
- price < 2000 => No discount
Since price = 6000 (greater than 5000):
Discount = 6000 * 20 / 100 = 1200
Final Price = 6000 - 1200 = 4800
This program teaches percentage calculation and conditional discounting.*/

import java.util.*;
class Product
{
	int id;
	String name;
	int price;
	
	void display()
	{
		System.out.println("Product Id :"+id);
		System.out.println("Product Name :"+name);
		System.out.println("Original Price :"+price);
		
		if(price>5000)
		{
			System.out.println("Discount : 20%");
			price = price - (price*20/100);
			System.out.println("Final price :"+price);
		}
		else if(price>=2000 && price<=5000)
		{
			System.out.println("Discount : 10%");
			price = price - (price*10/100);
			System.out.println("Final price :"+price);
		}
		else if(price<2000)
		{
			System.out.println("No Discount");
			System.out.println("Final price :"+price);
		}
	}
  public static void main(String x[])
 {
	Scanner xyz = new Scanner(System.in);
	Product p = new Product();
	
	System.out.println("Enter Product Id");
	p.id = xyz.nextInt();
	xyz.nextLine();
	System.out.println("Enter Product Name");
	p.name = xyz.nextLine();
	System.out.println("Enter price");
	p.price = xyz.nextInt();
	
	p.display();
 }
}
