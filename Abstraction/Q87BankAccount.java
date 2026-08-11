/*Question 87: Abstract BankAccount with calculateInterest().
Asked In Practice Assignment
Description:
Calculate 4% interest for each account.
Input:
2
Vivek 10000
Amit 20000

Output:
Vivek Interest: 400
Amit Interest: 800*/

import java.util.*;
abstract class BankAccount
{
	abstract void calculateInterest();
}
class Account extends BankAccount
{
	String name;
	int amt;
	Account(String name,int amt)
	{
		this.name = name;
		this.amt = amt;
	}
	void calculateInterest()
	{
		int interest = (amt*4)/100;
		System.out.println(name+ "\tInterest: "+interest);
	}
}
class Q87BankAccount
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of bank account");
		int n = xyz.nextInt();
		
		BankAccount a[] = new BankAccount[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name");
			String name = xyz.next();
			
			System.out.println("Enter Amount");
			int amt = xyz.nextInt();
			
			a[i] = new Account(name,amt);
		}
		System.out.println("Display Output");
		for(int i=0;i<n;i++)
		{
			a[i].calculateInterest();
		}
	}
}