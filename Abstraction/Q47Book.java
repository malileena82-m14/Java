/*Question 47: Create an abstract class Book to manage book issue details.
Asked In Practice Question
Abstract class Book contains title and abstract method getDetails().
Subclasses:

EBook ? display file size

PrintedBook ? display number of pages

Input
Type: EBook
Title: Java Basics
File Size: 5MB
Output
Book: Java Basics
File Size: 5MB*/

import java.util.*;
abstract class Book
{
	String title;
	Book(String title)
	{
		this.title = title;
	}
	void display()
	{
		System.out.println("Title: "+title);
	}
	abstract void getDetails();
}
class EBook extends Book
{
	String size;
	EBook(String title,String size)
	{
		super(title);
		this.size = size;
	}
	void getDetails()
	{
		System.out.println("File Size: "+size);
	}
}
class PrintedBook extends Book
{
	int no;
	PrintedBook(String title,int no)
	{
		super(title);
		this.no = no;
	}
	void getDetails()
	{
		System.out.println("Number of Pages: "+no);
	}
}
class Q47Book
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Type of Book");
		String type = xyz.next();
		
		System.out.println("Title Of Book");
		String title = xyz.next();
		xyz.nextLine();
		
		Book b;
		
		if(type.equalsIgnoreCase("Ebook"))
		{
			System.out.println("File Size");
			String size = xyz.next();
			
			b = new EBook(title,size);
			b.display();
			b.getDetails();
		}
		else
		{
			System.out.println("Number of Pages");
			int no = xyz.nextInt();
			b = new PrintedBook(title,no);
			b.display();
			b.getDetails();
			
		}
	}
}