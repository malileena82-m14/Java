/*Question 86: Abstract ProductBase with calculateDiscount().
Asked In Practice Assignment
Description:
Apply 5% discount on each product and display final price.

Input:

2
101 1000
102 2000

Output:
Product 101 Final Price: 950
Product 102 Final Price: 1900*/

import java.util.*;
abstract class ProductBase
{
	abstract void calculateDiscount();
}
class Product extends ProductBase
{
	int id;
	int price;
	Product(int id,int price)
	{
		this.id = id;
		this.price = price;
	}
	void calculateDiscount()
	{
		int fp = price-((price*5)/100);
		System.out.println("Product: "+id+"\t"+"Final price: "+fp);
	}
}
class Q86ProductBase
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of product");
		int n = xyz.nextInt();
		
		ProductBase a[] = new ProductBase[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Product Id");
			int id = xyz.nextInt();
			
			System.out.println("Enter Product Price");
			int price = xyz.nextInt();
			
			a[i] = new Product(id,price);
		}
		System.out.println("Display Output");
		for(int i=0;i<n;i++)
		{
			a[i].calculateDiscount();
		}
	}
}