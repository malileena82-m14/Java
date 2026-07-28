/*Question 57: Create abstract class Bonus
Asked In Practice Question
Abstract method calculateBonus().
Subclasses:

Manager

Developer

Input
Salary: 50000
Bonus %: 10
Output
Bonus: 5000*/

import java.util.*;
abstract class Bonus
{
	int sal;
	int bonus;
	Bonus(int sal,int bonus)
	{
		this.sal = sal;
		this.bonus = bonus;
	}
	abstract void calculateBonus();
}
class Manager extends Bonus
{
	Manager(int sal,int bonus)
	{
		super(sal,bonus);
	}
	void calculateBonus()
	{
		System.out.println("Bonus: "+(sal*bonus)/100);
	}
}
class Developer extends Bonus
{
	Developer(int sal,int bonus)
	{
		super(sal,bonus);
	}
	void calculateBonus()
	{
		System.out.println("Bonus: "+(sal*bonus)/100);
	}
}
class Q57Bonus
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Manager");
		System.out.println("2.Developer");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Bonus b;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Salary");
				int sal = xyz.nextInt();
				System.out.println("Enter Bonus");
				int bonus = xyz.nextInt();
				
				b = new Manager(sal,bonus);
				b.calculateBonus();
				break;
				
			case 2:
				System.out.println("Enter Salary");
				int sal1 = xyz.nextInt();
				System.out.println("Enter Bonus");
				int bonus1 = xyz.nextInt();
				
				b = new Developer(sal1,bonus1);
				b.calculateBonus();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}