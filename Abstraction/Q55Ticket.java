/*Question 55: Create abstract class Ticket.
Asked In Practice Question
Abstract method bookTicket().
Subclasses:

MovieTicket

BusTicket

Input
Type: Movie
Seats: 2
Price: 150
Output
Total Cost: 300*/

import java.util.*;
abstract class Ticket
{
	int seats;
	int price;
	Ticket(int seats,int price)
	{
		this.seats = seats;
		this.price = price;
	}
	abstract void bookTicket();
}
class MovieTicket extends Ticket
{
	MovieTicket(int seats,int price)
	{
		super(seats,price);
	}
	void bookTicket()
	{
		System.out.println("Total Cost: "+(seats*price));
	}
}
class BusTicket extends Ticket
{
	BusTicket(int seats,int price)
	{
		super(seats,price);
	}
	void bookTicket()
	{
		System.out.println("Total Cost: "+(seats*price));
	}
}
class Q55Ticket
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.MovieTicket");
		System.out.println("2.BusTicket");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Ticket t;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Seats");
				int seats = xyz.nextInt();
				
				System.out.println("Enter Price");
				int price = xyz.nextInt();
				
				t = new MovieTicket(seats,price);
				t.bookTicket();
				break;
				
			case 2:
				System.out.println("Enter Seats");
				int seats1 = xyz.nextInt();
				
				System.out.println("Enter price");
				int price1 = xyz.nextInt();
				
				t= new BusTicket(seats1,price1);
				t.bookTicket();
				break;
				
			default:
				System.out.println("Wrong choice");
				
		}
	}
}
