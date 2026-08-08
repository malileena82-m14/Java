/*Question 82: Create an abstract class Person with method display(). Create a POJO class Student (id, name, marks) using constructor. 
Store students in an array.
Asked In Practice Assignment
You need to take multiple student details, store them in an array of objects, and display all student details using abstraction.
Input: 
Enter number of students: 3
1 Vivek 78
2 Amit 65
3 Neha 85 
Output:
Student Details:
ID:1 Name:Vivek Marks:78
ID:2 Name:Amit Marks:65
ID:3 Name:Neha Marks:85*/

import java.util.*;
abstract class Person
{
	abstract void display();
}
class Student extends Person
{
	private int id;
	private String name;
	private int marks;
	
	Student(int id,String name,int marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	public int getMarks()
	{
		return marks;
	}
	void display()
	{
		System.out.println("ID: "+getId()+ "  Name: "+getName()+ "  Marks: "+getMarks());
	}
}
class Q82Person
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of Student");
		int n = xyz.nextInt();
		
		Person a[] = new Person[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Id");
			int id = xyz.nextInt();
			
			System.out.println("Enter Name");
			String name = xyz.next();
			
			System.out.println("Enter Marks");
			int marks = xyz.nextInt();
			
			a[i] = new Student(id,name,marks);
		}
		System.out.println("Student Details");
		for(int i=0;i<n;i++)
		{
			a[i].display();
		}
	}
}