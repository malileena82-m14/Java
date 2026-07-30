/*Question 68: Create abstract class Attendance.
Asked In Practice Question
Abstract method calculateAttendance().
Subclasses:

FullDay

HalfDay

Input
Days: 20
Output
Attendance: 20 days*/

import java.util.*;
abstract class Attendance
{
	int days;
	Attendance(int days)
	{
		this.days = days;
	}
	abstract void calculateAttendance();
}
class FullDay extends Attendance
{
	FullDay(int days)
	{
		super(days);
	}
	void calculateAttendance()
	{
		System.out.println("Attendance: "+days+" days");
	}
}
class HalfDay extends Attendance
{
	HalfDay(int days)
	{
		super(days);
	}
	void calculateAttendance()
	{
		System.out.println("Attendance: "+days+" days");
	}
}
class Q68Attendance
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.FullDay");
		System.out.println("2.HalfDay");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		Attendance a;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Days");
				int days = xyz.nextInt();
				a = new FullDay(days);
				a.calculateAttendance();
				break;
				
			case 2:
				System.out.println("Enter Days");
				int days1 = xyz.nextInt();
				a = new HalfDay(days1);
				a.calculateAttendance();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}