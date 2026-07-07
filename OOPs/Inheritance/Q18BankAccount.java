/*Question 18: Design a banking system.
Create a base class BankAccount with attributes accountHolderName and balance.
Create a child class SavingsAccount that adds interestRate.
Use super to initialize parent properties.
Store 3 accounts using an array of objects and calculate final balance after adding interest.
Asked In Practice Assignment
Description
This mini project demonstrates a banking system using inheritance and
interest calculation logic with array handling.
Input
Enter number of Accounts: 3

Enter Name: Amit
Enter Balance: 10000
Enter Interest Rate: 5

Enter Name: Neha
Enter Balance: 20000
Enter Interest Rate: 4

Enter Name: Raj
Enter Balance: 15000
Enter Interest Rate: 6
Output
Name: Amit, Final Balance: 10500
Name: Neha, Final Balance: 20800
Name: Raj, Final Balance: 15900*/

import java.util.*;
class BankAccount
{
	String accountHolderName;
	int balance;
	void setData(String accountHolderName,int balance)
	{
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
}
class SavingsAccount extends BankAccount
{
	int interestRate;
	void display(String accountHolderName,int balance,int interestRate)
	{
		super.setData(accountHolderName,balance);
		this.interestRate = interestRate;
	}
	void show()
	{
		int fb = (balance*interestRate)/100;
		fb = balance + fb;
		System.out.println("Name: "+accountHolderName+", Final Balance: "+fb);
	}
}
class Q18BankAccount
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number Of Accounts");
		int num = xyz.nextInt();
		SavingsAccount a[] = new SavingsAccount[num];
		
		for(int i=0;i<num;i++)
		{
			a[i] = new SavingsAccount();
			System.out.println("Enter Name");
			String accountHolderName = xyz.next();
			
			System.out.println("Enter Balance");
			int balance = xyz.nextInt();
			
			System.out.println("Enter interest Rate");
			int interestRate = xyz.nextInt();
			
			a[i].display(accountHolderName,balance,interestRate);
		}	
		for(int i=0;i<num;i++)
		{
			a[i].show();
		}
	}
}