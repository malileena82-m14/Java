/*Question 74: Create abstract class SalarySlip.
Asked In Practice Question
Abstract method generateSlip().
Subclasses:

PermanentEmployee

ContractEmployee

Input
Salary: 40000
Output
Salary Slip Generated: 40000*/

import java.util.*;
abstract class SalarySlip
{
	int salary;
	SalarySlip(int salary)
	{
		this.salary = salary;
	}
	abstract void generateSlip();
}
class PermanentEmployee extends SalarySlip
{
	PermanentEmployee(int salary)
	{
		super(salary);
	}
	void generateSlip()
	{
		System.out.println("Salary Slip Generated: "+salary);
	}
}
class ContractEmployee extends SalarySlip
{
	ContractEmployee(int salary)
	{
		super(salary);
	}
	void generateSlip()
	{
		System.out.println("Salary Slip Generated: "+salary);
	}
}
class Q74SalarySlip
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.PermanentEmployee");
		System.out.println("2.ContractEmployee");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		SalarySlip s;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Salary");
				int salary = xyz.nextInt();
				s = new PermanentEmployee(salary);
				s.generateSlip();
				break;
				
			case 2:
				System.out.println("Enter Salary");
				int salary1 = xyz.nextInt();
				s = new ContractEmployee(salary1);
				s.generateSlip();
				break;
				
			default:
				System.out.println("Wrong Choice");
		}
	}
}