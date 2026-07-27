/*Question 52: Create abstract class Patient.
Asked In Practice Question
Abstract method calculateBill().
Subclasses:

InPatient

OutPatient

Input
Type: InPatient
Days: 3
Rate: 2000
Output
Total Bill: 6000*/

import java.util.*;
abstract class Patient
{
	int days;
	int rate;
	Patient(int days,int rate)
	{
		this.days = days;
		this.rate = rate;
	}
	abstract void calculateBill();
}
class InPatient extends Patient
{
	InPatient(int days,int rate)
	{
		super(days,rate);
	}
	void calculateBill()
	{
		System.out.println("Total Bill: "+(days*rate));
	}
}
class OutPatient extends Patient
{
	OutPatient(int days,int rate)
	{
		super(days,rate);
	}
	void calculateBill()
	{
		System.out.println("Total Bill: "+(days*rate));
	}
}
class Q52Patient
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.InPatient");
		System.out.println("2.OutPatient");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		Patient p ;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Days");
				int days = xyz.nextInt();
		
				System.out.println("Enter rate");
				int rate = xyz.nextInt();
				p = new InPatient(days,rate);
				p.calculateBill();
				break;
				
			case 2:
				System.out.println("Enter Days");
				int days1 = xyz.nextInt();
		
				System.out.println("Enter rate");
				int rate1 = xyz.nextInt();
				p = new OutPatient(days1,rate1);
				p.calculateBill();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}