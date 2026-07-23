/*Question 44: Create an abstract class BankAccount to perform banking operations.
Asked In Practice Question
Create abstract class BankAccount with:

Abstract methods deposit() and withdraw()

Variable balance

Create subclasses:

SavingsAccount ? minimum balance required

CurrentAccount ? no minimum balance

Program should perform deposit and withdrawal operations and display final balance.

Input
Account Type: Savings
Initial Balance: 1000
Deposit: 500
Withdraw: 300
Output
Final Balance: 1200*/

import java.util.*;
abstract class BankAccount
{
	int balance;
	BankAccount(int balance)
	{
		this.balance = balance;
	}
	abstract void deposit(int amount);
	abstract void withdraw(int amount);
	void display()
	{
		System.out.println("Final Balance: "+balance);
	}
}
class SavingsAccount extends BankAccount
{
	SavingsAccount(int balance)
	{
		super(balance);
	}
	void deposit(int amount)
	{
		balance = balance + amount;
	}
	void withdraw(int amount)
	{
		if(balance-amount>=500)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Minimum balance should be 500");
		}
	}
	
}
class CurrentAccount extends BankAccount
{
	CurrentAccount(int balance)
	{
		super(balance);
	}
	void deposit(int amount)
	{
		balance = balance+amount;
	}
	void withdraw(int amount)
	{
		balance = balance-amount;
	}
}
class Q44BankAccount
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Saving balance");
		System.out.println("2.Current balance");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		System.out.println("Enter initial balance");
		int balance = xyz.nextInt();
		System.out.println("Enter Deposit");
		int deposit = xyz.nextInt();
		System.out.println("Enter withdraw");
		int withdraw = xyz.nextInt();
		
		BankAccount b;
		switch(choice)
		{
			case 1:
				b = new SavingsAccount(balance);
				b.deposit(deposit);
				b.withdraw(withdraw);
				b.display();
				break;
				
			case 2:
				b = new CurrentAccount(balance);
				b.deposit(deposit);
				b.withdraw(withdraw);
				b.display();
				break;
				
			default:
				System.out.println("Invalid choice");
		}
	}
}