/*Question 12: Create a base class Movie with attributes movieName and ticketPrice.
Create a child class Booking that adds numberOfTickets.
Use super to initialize parent properties.
Store 3 bookings using an array of objects and calculate total cost.
Asked In Practice Assignment
Description
This program demonstrates real-world booking system using inheritance.
The super keyword is used to initialize parent class values.

Input
Enter number of Bookings: 3

Enter Movie Name: Avengers
Enter Ticket Price: 200
Enter Number of Tickets: 2

Enter Movie Name: Batman
Enter Ticket Price: 150
Enter Number of Tickets: 3

Enter Movie Name: Spiderman
Enter Ticket Price: 180
Enter Number of Tickets: 1
Output
Movie: Avengers, Total Cost: 400
Movie: Batman, Total Cost: 450
Movie: Spiderman, Total Cost: 180*/

import java.util.*;
class Movie
{
	String movieName;
	int ticketPrice;
	void setData(String movieName,int ticketPrice)
	{
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
	}
}
class Booking extends Movie
{
	int numberOfTickets;
	void show(String movieName,int ticketPrice,int numberOfTickets)
	{
		super.setData(movieName,ticketPrice);
		this.numberOfTickets = numberOfTickets;
	}
	void display()
	{
		System.out.println("Movie: "+movieName+", Total Cost: "+(ticketPrice*numberOfTickets));
	}
}
class Q12Movie
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of Bookings");
		int num = xyz.nextInt();
		
		Booking a[] = new Booking[num];
		for(int i=0;i<num;i++)
		{
			a[i] = new Booking();
			
			System.out.println("Enter Movie Name");
			String movieName = xyz.next();
			
			System.out.println("Enter Ticket Price");
			int ticketPrice = xyz.nextInt();
			
			System.out.println("Enter Number of Tickets");
			int numberOfTickets = xyz.nextInt();
			
			a[i].show(movieName,ticketPrice,numberOfTickets);
		}
		for(int i=0;i<num;i++)
		{
			a[i].display();
		}
	}
}
