/*2. Food Delivery Application
A food delivery company supports different restaurants.
Requirements:
•	Create an abstract class Restaurant. 
•	Create child classes PizzaRestaurant, ChineseRestaurant, and SouthIndianRestaurant. 
•	Every restaurant prepares food differently. 
•	Delivery charges should be calculated differently. 
•	Payment should support multiple methods like UPI, Credit Card, and Cash on Delivery. 
•	The company logo method should never be overridden. 
•	Use a parent reference to invoke child methods. 
•	Initialize restaurant details using the parent constructor. 
Implement using:
•	Inheritance 
•	Abstract Class 
•	Interface 
•	Overriding 
•	Dynamic Polymorphism 
•	super() Constructor 
•	final Method 
•	Loose Coupling*/

import java.util.*;
interface Payment
{
	void payment(int choice);
}
abstract class Restaurant implements Payment
{
	int restaurantId;
	String restaurantName;
	Restaurant(int restaurantId,String restaurantName)
	{
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
	}
	void display()
	{
		System.out.println("Restaurant Id "+restaurantId);
		System.out.println("Restaurant Name "+restaurantName);
	}
	abstract void preparedFood();
	abstract void deliveryCharges();
	final void companyLogo()
	{
		System.out.println("Company logo display");
	}
}
class PizzaRestaurant extends Restaurant
{
	PizzaRestaurant(int restaurantId,String restaurantName)
	{
		super(restaurantId,restaurantName);
	}
	void preparedFood()
	{
		System.out.println("Pizza is delivery");
	}
	void deliveryCharges()
	{
		System.out.println("Delivery charges: 50");
	}
	public void payment(int choice)
	{
		switch(choice)
		{
			case 1: 
				System.out.println("Payment by UPI");
				break;
			case 2:
				System.out.println("Payment by credit card");
				break;
			case 3:
				System.out.println("Payment by Cash on delivery");
				break;
			default:
				System.out.println("Invalid Payment Method");
		}
	}
}
class ChineseRestaurant extends Restaurant
{
	ChineseRestaurant(int restaurantId,String restaurantName)
	{
		super(restaurantId,restaurantName);
	}
	void preparedFood()
	{
		System.out.println("Chinese food prepared");
	}
	void deliveryCharges()
	{
		System.out.println("Delivery charges: 40");
	}
	public void payment(int choice)
	{
		switch(choice)
		{
			case 1: 
				System.out.println("Payment by UPI");
				break;
			case 2:
				System.out.println("Payment by credit card");
				break;
			case 3:
				System.out.println("Payment by Cash on delivery");
				break;
			default:
				System.out.println("Invalid Payment Method");
		}
	}
}
class SouthIndianRestaurant extends Restaurant
{
	SouthIndianRestaurant(int restaurantId,String restaurantName)
	{
		super(restaurantId,restaurantName);
	}
	void preparedFood()
	{
		System.out.println("South Indian Food Prepared");
	}
	void deliveryCharges()
	{
		System.out.println("Delivery charges: 30");
	}
	public void payment(int choice)
	{
		switch(choice)
		{
			case 1: 
				System.out.println("Payment by UPI");
				break;
			case 2:
				System.out.println("Payment by credit card");
				break;
			case 3:
				System.out.println("Payment by Cash on delivery");
				break;
			default:
				System.out.println("Invalid Payment Method");
		}
	}
}
class Q2Restaurant
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("1.PizzaRestaurant");
		System.out.println("2.ChineseRestaurant");
		System.out.println("3.SouthIndianRestaurant");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Restaurant r;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Restaurant Id");
				int restaurantId = xyz.nextInt();
		
				System.out.println("Enter Restaurant Name");
				String restaurantName = xyz.next();
				
				System.out.println("Choose Payment Method");
				System.out.println("1. UPI");
				System.out.println("2. Credit Card");
				System.out.println("3. Cash on Delivery");
				int paymentChoice = xyz.nextInt();
				r = new PizzaRestaurant(restaurantId,restaurantName);
				r.display();
				r.preparedFood();
				r.deliveryCharges();
				r.payment(paymentChoice);
				System.out.println("Food Delivered Successfully");
				r.companyLogo();
				break;
				
			case 2:
				System.out.println("Enter Restaurant Id");
				int restaurantId1 = xyz.nextInt();
		
				System.out.println("Enter Restaurant Name");
				String restaurantName1 = xyz.next();
				
				System.out.println("Choose Payment Method");
				System.out.println("1. UPI");
				System.out.println("2. Credit Card");
				System.out.println("3. Cash on Delivery");
				paymentChoice = xyz.nextInt();
				
				r = new ChineseRestaurant(restaurantId1,restaurantName1);
				r.display();
				r.preparedFood();
				r.deliveryCharges();
				r.payment(paymentChoice);
				System.out.println("Food Delivered Successfully");
				r.companyLogo();
				break;
				
			case 3:
				System.out.println("Enter Restaurant Id");
				int restaurantId2 = xyz.nextInt();
		
				System.out.println("Enter Restaurant Name");
				String restaurantName2 = xyz.next();
				
				System.out.println("Choose Payment Method");
				System.out.println("1. UPI");
				System.out.println("2. Credit Card");
				System.out.println("3. Cash on Delivery");
				paymentChoice = xyz.nextInt();
				
				r = new SouthIndianRestaurant(restaurantId2,restaurantName2);
				r.display();
				r.preparedFood();
				r.deliveryCharges();
				r.payment(paymentChoice);
				System.out.println("Food Delivered Successfully");
				r.companyLogo();
				break;
				
			default:
				System.out.println("Invalid choice");
				
		}
		
	}
}