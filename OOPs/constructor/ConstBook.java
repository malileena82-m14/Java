/*Question 3: Write a Java program to demonstrate constructor overloading using a Book class.

Description: Create Book class with bookId, bookName and price. Create one default constructor and one parameterized constructor. 
Display values initialized by both constructors.
INPUT:
(Default constructor gives default values)
Enter Book Id: 11
Enter Book Name: Java Basics
Enter Price: 450

OUTPUT:
Book from Default Constructor:
Book Id: 0
Book Name: Unknown
Price: 0

Book from Parameterized Constructor:
Book Id: 11
Book Name: Java Basics
Price: 450

EXPLANATION:
Create two constructors: public Book() { bookId=0; bookName="Unknown"; price=0; } and public Book(int id, String name, int p) 
{ bookId=id; bookName=name; price=p; }. Demonstrate both by creating two objects.*/

import java.util.*;
class Book
{
	int id;
	String name;
	int price;
	
	Book(int id,String name,int price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	Book()
	{
		id = 0;
		name = "Unknown";
		price = 0;
	}
	void display()
	{
		System.out.println("Book Id :"+id);
		System.out.println("Book Name :"+name);
		System.out.println("Price :"+price);
	}
	
}
class ConstBook
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter Book Id :");
		int id = xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Book Name :");
		String name = xyz.nextLine();
		System.out.println("Enter Price :");
		int price = xyz.nextInt();
		
		Book bk1 = new Book(id,name,price);
		Book bk2 = new Book();
		
		bk1.display();
		bk2.display();
	}
}