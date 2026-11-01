/*5. Write a Java program to demonstrate object creation by creating an `Employee` class and creating two Employee objects.*/

import java.util.*;
class Employee
{
	void display(int id)
	{
		System.out.println("ID : "+id);
	}
	void display(int id,String name)
	{
		System.out.println("ID : "+id+ " Name : "+name);
	}
}
class Q5Employee
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		System.out.println("Enter Id");
		int id = xyz.nextInt();
		System.out.println("Enter Name");
		String name = xyz.next();
		
		e1.display(id);
		e1.display(id,name);
		e2.display(id);
		e2.display(id,name);
	}
}