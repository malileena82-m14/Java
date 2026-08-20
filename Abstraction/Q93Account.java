/*Question 93: Abstract class Account with method withdraw().
Asked In Practice Assignment
Create POJO class with balance.
Store account in array
Perform withdrawal
Update and print remaining balance

Input:
1
Vivek 10000
3000

Output:
Remaining Balance: 7000*/

import java.util.*;
abstract class Account
{
	abstract void withdraw();
}
class Bank extends Account
{
	private String name;
	private int balance;
	private int w;
	Bank(String name,int balance,int w)
	{
		this.name = name;
		this.balance = balance;
		this.w = w;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setW(int w)
	{
		this.w = w;
	}
	public int getW()
	{
		return w;
	}
	void withdraw()
	{
		System.out.println("Remaining Balance: "+(balance-w));
	}
}
class Q93Account
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input");
		int n = xyz.nextInt();
		Account a[] = new Account[n];
		
		for(int i=0;i<n;i++)
		{
			String name = xyz.next();
			int balance = xyz.nextInt();
			int w = xyz.nextInt();
			
			a[i] = new Bank(name,balance,w);
		}
		for(int i=0;i<n;i++)
		{
			a[i].withdraw();
		}
	}
}
