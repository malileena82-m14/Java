/*Question 99: Abstract class Patient.
Asked In Practice Assignment
Calculate bill based on:
Number of days
Charge per day

Input:
Ravi
3
2000

Output:
Total Bill: 6000*/

import java.util.*;
abstract class Patient
{
	String name;
	int day;
	int charge;
	Patient(String name,int day,int charge)
	{
		this.name = name;
		this.day = day;
		this.charge = charge;
	}
}
class Bill extends Patient
{
	Bill(String name,int day,int charge)
	{
		super(name,day,charge);
	}
	void calculate()
	{
		int total = day * charge;
		System.out.println("Total Bill: "+total);
	}
}
class Q99Patient
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = xyz.nextLine();
		
		System.out.println("Enter Days");
		int day = xyz.nextInt();
		
		System.out.println("Enter Charge per day");
		int charge = xyz.nextInt();
		
		Bill b = new Bill(name,day,charge);
		b.calculate();
	}
}