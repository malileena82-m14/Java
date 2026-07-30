/*Question 70: Create abstract class Deduction.
Asked In Practice Question
Abstract method calculateDeduction().
Subclasses:

TaxDeduction

PFDeduction

Input
Salary: 30000
Deduction : 10%
Output
Deduction: 3000*/

import java.util.*;
abstract class Deduction
{
	int sal;
	int ded;
	Deduction(int sal,int ded)
	{
		this.sal = sal;
		this.ded = ded;
	}
	abstract void calculateDeduction();
}
class TaxDeduction extends Deduction
{
	TaxDeduction(int sal,int ded)
	{
		super(sal,ded);
	}
	void calculateDeduction()
	{
		System.out.println("Deduction: "+(sal*ded)/100);
	}
}
class PFDeduction extends Deduction
{
	PFDeduction(int sal,int ded)
	{
		super(sal,ded);
	}
	void calculateDeduction()
	{
		System.out.println("Deduction: "+(sal*ded)/100);
	}
}
class Q70Deduction
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.TaxDeduction");
		System.out.println("2.PFDeduction");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Deduction d;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter salary");
				int sal = xyz.nextInt();
				System.out.println("Enter Deduction");
				int ded = xyz.nextInt();
				d = new TaxDeduction(sal,ded);
				d.calculateDeduction();
				break;
				
			case 2:
				System.out.println("Enter salary");
				int sal1 = xyz.nextInt();
				System.out.println("Enter Deduction");
				int ded1 = xyz.nextInt();
				d = new PFDeduction(sal1,ded1);
				d.calculateDeduction();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}