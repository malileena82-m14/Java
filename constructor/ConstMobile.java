/*Question 13: Write a Java program to demonstrate constructor overloading in a Mobile class and apply discount calculation.

Description: Create Mobile class with mobileId, mobileName and price. Create overloaded constructors 
(one without discount, one with discount). If discount constructor used, reduce 10% price.
INPUT:
Enter Mobile Id: 101
Enter Mobile Name: Samsung
Enter Price: 20000

OUTPUT:
Original Price: 20000
Discount Price: 18000

EXPLANATION:
Create two constructors: public Mobile(int id, String name, int p) and public Mobile(int id, String name, int p, boolean discount). 
First constructor stores original price. Second constructor calculates 10% discount: price = price - (price * 10 / 100). 
Display both original and discounted price.*/

import java.util.*;
class Mobile
{
	int id;
	String name;
    int price;
	boolean discount;
	
	public Mobile(int id,String name,int price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Mobile(int id,String name,int price,int discount)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	void discount()
	{
		discount = price - (price * 10 / 100);
	}
	void display()
	{
		System.out.println("Original Price :"+price);
		System.out.println("discount Price :"+)
	}
}
class ConstMobile
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Mobile Id");
		int id = xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Mobile Name");
		String name = xyz.nextLine();
		System.out.println("Enter Price");
		int price = xyz.nextInt();
		
		Mobile m = new Mobile();
		
		m.discount();
		m.display();
		
	}
}