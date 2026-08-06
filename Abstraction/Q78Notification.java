/*Question 78: Create abstract class Notification.
Asked In Practice Question
Abstract method sendNotification().
Subclasses:

EmailNotification

SMSNotification

Input
Type: Email
Output
Email Sent Successfully*/

import java.util.*;
abstract class Notification
{
	String type;
	Notification(String type)
	{
		this.type = type;
	}
	abstract void sendNotification();
}
class EmailNotification extends Notification
{
	EmailNotification(String type)
	{
		super(type);
	}
	void sendNotification()
	{
		System.out.println("Email Sent Successfully");
	}
}
class SMSNotification extends Notification
{
	SMSNotification(String type)
	{
		super(type);
	}
	void sendNotification()
	{
		System.out.println("SMS Sent Successfully");
	}
}
class Q78Notification
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Email");
		System.out.println("2.SMS");
		System.out.println("Enter type");
		String type = xyz.next();
		
		Notification n;
		
		if(type.equalsIgnoreCase("email"))
		{
			n = new EmailNotification(type);
			n.sendNotification();
		}
		else
		{
			n = new SMSNotification(type);
			n.sendNotification();
		}
	}
}