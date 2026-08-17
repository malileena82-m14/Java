/*Q6. Create an abstract class Employee with employee details and an abstract method calculateSalary(). 
Create an interface Bonus with method calculateBonus(). Implement both in PermanentEmployee and ContractEmployee. 
Explanation: 
• Permanent employees receive a bonus of 15% of salary.  
• Contract employees receive a bonus of 5%.  
• Use constructor to initialize employee information.  
• Calculate salary + bonus.  
• Display employee type, salary, bonus and final amount.  
Input: Permanent Employee: 
Name = Rahul 
Salary = 60000 
Contract Employee:
Name = Amit 
Salary = 50000 
Output: 
Permanent Employee: 
Name = Rahul
Salary = 60000 
Bonus = 9000 
Final Salary = 69000  

Contract Employee:
Name = Amit 
Salary = 50000 
Bonus = 2500 
Final Salary = 52500 */

import java.util.*;
interface Bonus 
{
	void calculateBonus();
}
abstract class Employee implements Bonus
{
	String name;
	int salary;
	public Employee(String name,int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	abstract void calculateSalary();
}
class PermanentEmployee extends Employee
{
	PermanentEmployee(String name,int salary)
	{
		super(name,salary);
	}
	void calculateSalary()
	{
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	void calculateBonus()
	{
		int bonus = (salary*15)/100;
		System.out.println("Bonus: "+bonus);
		System.out.println("Final Salary: "+(salary+bonus));
	}
}
class ContractEmployee extends Employee
{
	ContractEmployee(String name,int salary)
	{
		super(name,salary);
	}
	void calculateSalary()
	{
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	void calculateBonus()
	{
		int bonus = (salary*5)/100;
		System.out.println("Bonus: "+bonus);
		System.out.println("Final Salary: "+(salary+bonus));
	}
}
class Q6Employee
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Employee Details");
		System.out.println("1.PermanentEmployee");
		System.out.println("2.ContractEmployee");
		System.out.println("Enter a choice");
		int choice = xyz.nextInt();
		
		Employee e;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Employee name");
				String name = xyz.next();
				System.out.println("Enter Salary");
				int salary = xyz.nextInt();
				e = new PermanentEmployee(name,salary);
				e.calculateSalary();
				e.calculateBonus();
				break;
				
			case 2:
				System.out.println("Enter Employee name");
				String name1 = xyz.next();
				System.out.println("Enter Salary");
				int salary1 = xyz.nextInt();
				e = new ContractEmployee(name1,salary1);
				e.calculateSalary();
				e.calculateBonus();
				break;
				
			default:
				System.out.println("Invalid choice");
		}
	}
}