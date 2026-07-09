/*Question 26: Create a base class Account with attributes accountNumber.
Create a child class Savings that adds balance.
Create another child class FixedDeposit that adds interestRate.
Use constructor chaining (super()) to initialize all fields.
Store 2 accounts using an array of objects and calculate maturity amount.
Asked In Practice Assignment
Description
This assignment demonstrates financial system using multilevel
inheritance and constructor chaining.
Input
Enter number of Accounts: 2

Enter Account Number: 101
Enter Balance: 10000
Enter Interest Rate: 5

Enter Account Number: 102
Enter Balance: 20000
Enter Interest Rate: 6
Output
Account: 101, Maturity Amount: 10500
Account: 102, Maturity Amount: 21200*/

import java.util.*;
class Amount
{
	int accountNumber;
	Amount(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
}
class Savings extends Amount
{
	int balance;
	Savings(int accountNumber,int balance)
	{
		super(accountNumber);
		this.balance = balance;
	}
}
class FixedDeposit extends Savings
{
	int interestRate;
	FixedDeposit(int accountNumber,int balance,int interestRate)
	{
		super(accountNumber,balance);
		this.interestRate = interestRate;
	}
	void show()
	{
		int interest = (balance*interestRate)/100;
		int ma = interest + balance;
		System.out.println("Account: "+accountNumber+", Maturity Amount: "+ma);
	}
}
class Q26Amount
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of accounts");
		int num = xyz.nextInt();
		
		FixedDeposit a[] = new FixedDeposit[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Account Number");
			int accountNumber = xyz.nextInt();
			
			System.out.println("Enter Balance");
			int balance = xyz.nextInt();
			
			System.out.println("Enter Interest rate");
			int interestRate = xyz.nextInt();
			
			a[i] = new FixedDeposit(accountNumber,balance,interestRate);
		}
		for(int i=0;i<num;i++)
		{
			a[i].show();
		}
	}
}
