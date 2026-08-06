/*1. Online Banking System
A bank wants to develop an application with the following requirements:
•	Create a superclass Account containing common properties like account number, holder name, and balance. 
•	Create subclasses SavingsAccount and CurrentAccount. 
•	Every account must implement a method to calculate yearly charges, but the calculation is different for each account type. 
•	Ensure the account number cannot be modified after object creation. 
•	Use the parent constructor to initialize common data. 
•	The bank manager should be able to access all account types using a single reference. 
•	The interest calculation method in the parent should not be inherited directly. 
•	The project should follow loose coupling so that new account types can be added without changing existing code. 
Implement using:
•	Inheritance 
•	Abstract Class 
•	Method Overriding 
•	super() Constructor 
•	final Keyword 
•	Dynamic Polymorphism 
•	Interface 
•	Loose Coupling */

import java.util.*;
interface CalculateCharges 
{
	void CalculateCharges();
}
abstract class Account implements CalculateCharges
{
	final int accNo;
	String hName;
	int balance;
	Account(int accNo,String hName,int balance)
	{
		this.accNo = accNo;
		this.hName = hName;
		this.balance = balance;
	}
	public abstract void CalculateCharges();
}
class SavingsAccount extends Account
{
	SavingsAccount(int accNo,String hName,int balance)
	{
		super(accNo,hName,balance);
	}
	public void CalculateCharges()
	{
		double charges = balance*0.02;
		System.out.println("Account Number: "+accNo);
		System.out.println("Holder Name: "+hName);
		System.out.println("Balance: "+balance);
		System.out.println("Savings Account Yearly Charges: "+charges);
	}
}
class CurrentAccount extends Account
{
	CurrentAccount(int accNo,String hName,int balance)
	{
		super(accNo,hName,balance);
	}
	public void CalculateCharges()
	{
		double charges = balance*0.05;
		System.out.println("Account Number: "+accNo);
		System.out.println("Holder Name: "+hName);
		System.out.println("Balance: "+balance);
		System.out.println("Current Account Yearly Charges: "+(balance*2)/100);
	}
}
class Q1ScenarioAccount
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.SavingsAccount");
		System.out.println("2.CurrentAccount");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		Account a;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Account Number");
				int accNo = xyz.nextInt();
				xyz.nextLine();
				
				System.out.println("Enter Holder Name");
				String hName = xyz.nextLine();
				
				System.out.println("Enter Balance");
				int balance = xyz.nextInt();
				
				a = new SavingsAccount(accNo,hName,balance);
				a.CalculateCharges();
				
				break;
				
			case 2:
				System.out.println("Enter Account Number");
				int accNo1 = xyz.nextInt();
				xyz.nextLine();
				
				System.out.println("Enter Holder Name");
				String hName1 = xyz.nextLine();
				
				System.out.println("Enter Balance");
				int balance1 = xyz.nextInt();
				
				a = new CurrentAccount(accNo1,hName1,balance1);
				a.CalculateCharges();
				
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}