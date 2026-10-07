/*9. Write a Java program to demonstrate Abstraction using an abstract class Employee with an abstract method 
calculateSalary(), and implement it in a Developer class. */

abstract class Employee
{
	abstract void calculateSalary();
}
class Developer extends Employee
{
	public void calculateSalary()
	{
		System.out.println("Salary");
	}
}
class Q9Abstraction
{
	public static void main(String x[])
	{
		Developer d = new Developer();
		d.calculateSalary();
	}
}