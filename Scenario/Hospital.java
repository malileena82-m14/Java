/*Function Overloading Scenario-Based Interview Questions
1.	Hospital Management System
In a hospital management application, you need to create an addPatient() method. Sometimes the receptionist 
enters only the patient's name and age, while in other cases they also enter address, phone number, and 
insurance details. How would you use method overloading to design the addPatient() functionality?
Scenario:
A hospital receptionist may have different amounts of information when registering a patient.
Case 1: The patient provides **name, age, address, and phone number**.
Case 2: The patient is admitted with complete details such as **name, age, address, phone number, and insurance 
information, min advance amount.*/

import java.util.*;
class Hospital
{
	void addPatient(String name,int age,String address,String number)
	{
		System.out.println("Patient Name : "+name);
		System.out.println("Age :"+age);
		System.out.println("Address : "+address);
		System.out.println("Number :"+number);
	}
	void addPatient(String name,int age,String address,String number,String insurance,int advance)
	{
		System.out.println("Patient Name : "+name);
		System.out.println("Age :"+age);
		System.out.println("Address : "+address);
		System.out.println("Number :"+number);
		System.out.println("Insurance : "+insurance);
		System.out.println("Advance :"+advance);
	}
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		Hospital h = new Hospital();
		System.out.println("Enter the name");
		String name = xyz.nextLine();
		
		System.out.println("Enter the Age");
		int age = xyz.nextInt();
		xyz.nextLine();
		
		System.out.println("Enter the Address");
		String address = xyz.nextLine();
		
		System.out.println("Enter the Number");
		String number = xyz.nextLine();
		
		h.addPatient(name,age,address,number);
		xyz.nextLine();
		
		System.out.println("Enter the name");
		String name1 = xyz.nextLine();
		
		System.out.println("Enter the Age");
		int age1 = xyz.nextInt();
		xyz.nextLine();
		
		System.out.println("Enter the Address");
		String address1 = xyz.nextLine();
		
		System.out.println("Enter the Number");
		String number1 = xyz.nextLine();
		
		System.out.println("Enter the insurance");
		String insurance1 = xyz.nextLine();
		
		System.out.println("Enter the advance");
		int advance1 = xyz.nextInt();
		
		h.addPatient(name1,age1,address1,number1,insurance1,advance1);
		
	}
}