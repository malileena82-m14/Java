/*10. Write a Java program to demonstrate the use of the super keyword. Create a parent class with a 
variable and method, and access both from the child class using super. */

import java.util.*;
class Teacher
{
	int id;
	String name;
	Teacher(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println("Id : "+id+" Name : "+name);
	}
}
class Student extends Teacher
{
	Student(int id,String name)
	{
		super(id,name);
	}
	void display()
	{
		super.display();
	}
}
class Q10SuperKeyword
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Student Id");
		int id = xyz.nextInt();
		
		System.out.println("Enter Student Name");
		String name = xyz.next();
		Student s   = new Student(id,name);
		s.display();
	}
}