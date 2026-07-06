/*Question 6: Create a base class Book with attributes title and price.
Create a child class EBook that adds fileSize.
Store details of 3 EBooks using an array of objects and display all details.
Asked In Practice Assignment
Description
This program demonstrates inheritance with an array of objects.
The child class EBook extends Book, and multiple objects are stored in an array.

Input
Enter number of EBooks: 3

Enter Title: Java Basics
Enter Price: 300
Enter File Size: 5

Enter Title: Python Guide
Enter Price: 400
Enter File Size: 8

Enter Title: C Programming
Enter Price: 250
Enter File Size: 6
Output
Title: Java Basics, Price: 300, File Size: 5MB
Title: Python Guide, Price: 400, File Size: 8MB
Title: C Programming, Price: 250, File Size: 6MB*/

import java.util.*;
class Book
{
	String title;
	int price;
}
class EBook extends Book
{
	int fileSize;
	void setData(String title,int price,int fileSize)
	{
		this.title = title;
		this.price = price;
		this.fileSize = fileSize;
	}
	void show()
	{
		System.out.println("Title:"+title + "Price:"+price + "File Size:"+ fileSize+"MB");
	}
	
}
class Q6Book
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number of Book");
		int num = xyz.nextInt();
		
		EBook a[] = new EBook[num];
		for(int i=0;i<num;i++)
		{
			a[i] = new EBook();
			System.out.println("Enter Title");
			String title = xyz.nextLine();
			xyz.nextLine();
			
			System.out.println("Enter Price");
			int price = xyz.nextInt();
			
			System.out.println("Enter File Size");
			int fileSize = xyz.nextInt();
			
			a[i].setData(title,price,fileSize);
		}
		
		for(int i=0;i<num;i++)
		{
			a[i].show();
		}
	}
}

