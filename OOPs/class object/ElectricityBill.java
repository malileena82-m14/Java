/*Question 7: Write a Java program to implement an Electricity Bill Calculator.
Create a class ElectricityBill with attributes customerId, name, and units.
Calculate bill using slabs:
- First 100 units => Rs.5 per unit
- Next 100 units => Rs.7 per unit
- Above 200 units => Rs.10 per unit
Display total bill.
Asked In: Practice assignment
Run
Clear
Input:
Enter Customer Id : 301
Enter Name : Suresh
Enter Units : 250

Output:
Customer Id : 301
Name : Suresh
Units : 250
Total Bill : Rs. 1850

Explanation:
A class ElectricityBill is created with customerId, name, and units.
Bill is calculated in slabs:
- First 100 units : 100 * 5 = 500
- Next 100 units : 100 * 7 = 700
- Remaining units : (250 - 200) = 50 units * 13 = 650
- Total Bill = 500 + 700 + 650 = 1850
The if-else conditions check: if units > 200, add slabs progressively.
This program demonstrates tiered calculation logic with class objects.*/

import java.util.*;
class ElectricityBill
{
	int id;
	String name;
	int unit;
	int tbill;
	
	void display()
	{
		System.out.println("Customer Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Units :"+unit);
		
		if(unit<=100)
		{
			tbill = unit*5;
		}
		else if(unit<=200)
		{
			tbill = 100*5+(unit-100)*7;
		}
		else
		{
			tbill = 100*5 + 100*7 + (unit-200)*13;
		}
		System.out.println("Total Bill :"+tbill);
	}
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		ElectricityBill E = new ElectricityBill();
		
		System.out.println("Enter Customer Id");
		E.id = xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Customer Name");
		E.name = xyz.nextLine();
		System.out.println("Enter Units");
		E.unit = xyz.nextInt();
		
		E.display();
	}
}