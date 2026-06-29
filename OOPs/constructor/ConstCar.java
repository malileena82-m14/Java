/*Question 8: Write a Java program to create a Car class and display car details using constructor.

Description: Create Car POJO class with carId, carName and price. Initialize values using constructor and display 
car information.
INPUT:
Enter Car Id: 301
Enter Car Name: Swift
Enter Price: 650000

OUTPUT:
Car Details:
Id: 301
Name: Swift
Price: 650000

EXPLANATION:
Create Car class with fields carId, carName, price. Use constructor public Car(int id, String name, int price) to initialize.
Create display() method to show all details. Create object new Car(301, "Swift", 650000) and call display().*/

import java.util.*;
class Car
{
	private int id;
	private String name;
	private int price;

	public Car(int id,String name,int price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	void display()
	{
		System.out.println("Id :"+id);
		System.out.println("name :"+name);
		System.out.println("price :"+price);
	}
}
class ConstCar
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter Car Id :");
		int id = xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Car Name :");
		String name = xyz.nextLine();
		System.out.println("Enter Price :");
		int price = xyz.nextInt();

		Car c = new Car(id,name,price);
		c.display();
	}
}