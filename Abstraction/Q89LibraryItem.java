/*Question 89: Create abstract class LibraryItem with method display().
Asked In Practice Assignment
Create a POJO class Book with attributes title and price.
Use constructor to initialize values
Store multiple books in an array
Override display() method
Print all book details

Input:
2
Java 500
Python 700

Output:

Book: Java Price: 500
Book: Python Price: 700*/

import java.util.*;
abstract class LibraryItem
{
	abstract void display();
}
class Book extends LibraryItem
{
	private String bName;
	private int price;
	Book(String bName,int price)
	{
		this.bName = bName;
		this.price = price;
	}
	public void setBName(String bName)
	{
		this.bName = bName;
	}
	public String getBName()
	{
		return bName;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	void display()
	{
		System.out.println("Book: "+bName+ " Price: "+price);
	}
}
class Q89LibraryItem
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Book");
		int n = xyz.nextInt();
		
		LibraryItem a[] = new LibraryItem[n];
		
		for(int i=0;i<n;i++)
		{
			String bName = xyz.next();
			int price = xyz.nextInt();
			a[i] = new Book(bName,price);
		}
		for(int i=0;i<n;i++)
		{
			a[i].display();
		}
	}
}