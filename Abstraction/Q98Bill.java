/*Question 98: Abstract class Bill.
Asked In Practice Assignment
Detailed Description:
Calculate bill using units.
Cost per unit = 5
Total = units * rate

Input:
150

Output:
Total Bill: 750*/

import java.util.*;
abstract class Bill
{
	int units;
	Bill(int units)
	{
		this.units = units; 
	}
}
class BillCharge extends Bill
{
	BillCharge(int units)
	{
		super(units);
	}
	void display()
	{
		int total = units * 5;
		System.out.println("Total Bill: "+total);
	}
}
class Q98Bill
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter units");
		int units = xyz.nextInt();
		
		BillCharge b = new BillCharge(units);
		b.display();
	}
}