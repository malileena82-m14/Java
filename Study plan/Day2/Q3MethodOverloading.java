/*3. Write a Java program to illustrate method overloading with multiple methods sharing the same name but 
different parameter lists. */

import java.util.*;
class Student 
{
	void display(int id)
	{
		System.out.println("Id : "+id);
	}
	void display(int id,String name)
	{
		System.out.println("ID : "+id+ " name : "+name);
	}
	void display(int id,String name,String course)
	{
		System.out.println("ID : "+id+ " name : "+name+ " Course : "+course);
	}
}
class Q3MethodOverloading
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		Student s = new Student();
		System.out.println("Id");
		int id = xyz.nextInt();
		System.out.println("Name");
		String name = xyz.next();
		System.out.println("Course Name");
		String course = xyz.next();
		
		s.display(id);
		s.display(id,name);
		s.display(id,name,course);
	}
}