/*8. Write a Java program to demonstrate Data Hiding using the private access modifier. Create a BankAccount class 
with a private balance and methods to deposit and display the balance.*/

class BankAccount
{
	private int balance;
	
	public void deposit(int amount)
	{
		balance = balance+amount;
	}
	public void displayBalance()
	{
		System.out.println("Balance = "+balance);
	}
}
class Q8DataHiding
{
	public static void main(String x[])
	{
		BankAccount b = new BankAccount();
		b.deposit(5000);
		b.displayBalance();
	}
}