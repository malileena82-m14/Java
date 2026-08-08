/*Question 81: Create abstract class Login.
Asked In Practice Question
Abstract method authenticate().
Subclasses:

AdminLogin

UserLogin

Input
Username: admin
Password: 1234
Output
Login Successful*/

import java.util.*;
abstract class Login
{
	String name;
	int pass;
	Login(String name,int pass)
	{
		this.name = name;
		this.pass = pass;
	}
	abstract void authenticate();
}
class AdminLogin extends Login
{
	AdminLogin(String name,int pass)
	{
		super(name,pass);
	}
	void authenticate()
	{
		System.out.println("Username: "+name);
		System.out.println("Password: "+pass);
	}
}
class UserLogin extends Login
{
	UserLogin(String name,int pass)
	{
		super(name,pass);
	}
	void authenticate()
	{
		System.out.println("Username: "+name);
		System.out.println("Password: "+pass);
	}
}
class Q81Login
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.AdminLogin");
		System.out.println("2.UserLogin");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Login l;
		switch(choice)
		{
			case 1:
				System.out.println("Enter Username");
				String name = xyz.next();
				System.out.println("Enter Password");
				int pass = xyz.nextInt();
				l = new AdminLogin(name,pass);
				l.authenticate();
				break;
				
			case 2:
				System.out.println("Enter Username");
				String name1 = xyz.next();
				System.out.println("Enter Password");
				int pass1 = xyz.nextInt();
				l = new AdminLogin(name1,pass1);
				l.authenticate();
				break;
				
			default:
				System.out.println("Invalid Choice");
		}
	}
}