/*4. Vehicle Rental System
A rental company rents Cars, Bikes, and Buses.
Requirements:
•	Create an abstract class Vehicle. 
•	Create subclasses Car, Bike, and Bus. 
•	Every vehicle calculates rent differently. 
•	Every vehicle must implement an insurance feature. 
•	Vehicle registration number cannot be changed. 
•	Use parent constructor to initialize vehicle details. 
•	Customers should rent vehicles using a common Vehicle reference. 
•	Manufacturer information should remain unchanged. 
Implement using:
•	Inheritance 
•	Abstract Class 
•	Interface 
•	Method Overriding 
•	Dynamic Polymorphism 
•	super() Constructor*/

import java.util.*;
interface Calculatesrent
{
	void Calculatesrent();
}
abstract class Vehicle implements Calculatesrent
{
	String registrationNo;
	String vehicleName;
	int rent;
	Vehicle(String registrationNo,String vehicleName,int rent)
	{
		this.registrationNo = registrationNo;
		this.vehicleName = vehicleName;
		this.rent = rent;
	}
	void ManufacturerInfo()
	{
		System.out.println("ABC Motors Pvt. Ltd.");
	}
	public abstract void Calculatesrent();
	public abstract void Insurance();
}
class Car extends Vehicle
{
	Car(String registrationNo,String vehicleName,int rent)
	{
		super(registrationNo,vehicleName,rent);
	}
	public void Calculatesrent()
	{
		System.out.println("Registration Number: "+registrationNo);
		System.out.println("Vehicle Name: "+vehicleName);
		System.out.println("rent: "+rent);
	}
	public void Insurance()
	{
		System.out.println("Insurance: Car Insurance Applied");
	}
}
class Bike extends Vehicle
{
	Bike(String registrationNo,String vehicleName,int rent)
	{
		super(registrationNo,vehicleName,rent);
	}
	public void Calculatesrent()
	{
		System.out.println("Registration Number: "+registrationNo);
		System.out.println("Vehicle Name: "+vehicleName);
		System.out.println("rent: "+rent);
	}
	public void Insurance()
	{
		System.out.println("Insurance: Bike Insurance Applied");
	}
}
class Bus extends Vehicle
{
	Bus(String registrationNo,String vehicleName,int rent)
	{
		super(registrationNo,vehicleName,rent);
	}
	public void Calculatesrent()
	{
		System.out.println("Registration Number: "+registrationNo);
		System.out.println("Vehicle Name: "+vehicleName);
		System.out.println("rent: "+rent);
	}
	public void Insurance()
	{
		System.out.println("Insurance: Bus Insurance Applied");
	}
}
class Q4ScenarioVehicle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Car");
		System.out.println("2.Bike");
		System.out.println("3.Bus");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		Vehicle v;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Registration Number");
				String registrationNo = xyz.next();
				
				System.out.println("Enter Vehicle Name");
				String vehicleName = xyz.next();
				
				System.out.println("Enter rent");
				int rent = xyz.nextInt();
				
				v = new Car(registrationNo,vehicleName,rent);
				v.Calculatesrent();
				v.Insurance();
				v.ManufacturerInfo();
				break;
				
			case 2:
				System.out.println("Enter Registration Number");
				String registrationNo1 = xyz.next();
				
				System.out.println("Enter Vehicle Name");
				String vehicleName1 = xyz.next();
				
				System.out.println("Enter rent");
				int rent1 = xyz.nextInt();
				
				v = new Bike(registrationNo1,vehicleName1,rent1);
				v.Calculatesrent();
				v.Insurance();
				v.ManufacturerInfo();
				break;
				
			case 3:
				System.out.println("Enter Registration Number");
				String registrationNo2 = xyz.next();
				
				System.out.println("Enter Vehicle Name");
				String vehicleName2 = xyz.next();
				
				System.out.println("Enter rent");
				int rent2 = xyz.nextInt();
				
				v = new Bus(registrationNo2,vehicleName2,rent2);
				v.Calculatesrent();
				v.Insurance();
				v.ManufacturerInfo();
				break;
				
			default:
				System.out.println("Wrong choice");
				
		}
	}
} 