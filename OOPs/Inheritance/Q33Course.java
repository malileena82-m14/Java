/*Question 33: Create a base class Course with attributes courseName and fee.
Use this keyword for initialization.

Create a child class Module that adds duration.
Create another child class AdvancedModule that adds extraFee.

Use this() + super() constructor chaining.
Store 2 modules using array and calculate final fee.
Asked In Practice Assignment
Description
Shows how this and super work together in multilevel constructor chaining.
Input
Enter number of Modules: 2

Enter Course Name: Java
Enter Fee: 10000
Enter Duration: 3
Enter Extra Fee: 2000

Enter Course Name: Python
Enter Fee: 8000
Enter Duration: 2
Enter Extra Fee: 1500
Output
Course: Java, Final Fee: 12000
Course: Python, Final Fee: 9500*/

import java.util.*;
class Course
{
	String courseName;
	int fee;
	Course(String courseName,int fee)
	{
		this.courseName = courseName;
		this.fee = fee;
	}
}
class Module extends Course
{
	int duration;
	Module(String courseName,int fee,int duration)
	{
		super(courseName,fee);
		this.duration = duration;
	}
}
class AdvancedModule extends Module
{
	int extraFee;
	AdvancedModule(String courseName,int fee,int duration,int extraFee)
	{
		super(courseName,fee,duration);
		this.extraFee = extraFee;
	}
	void show()
	{
		System.out.println("Course: "+courseName+", Final Fee: "+(fee + extraFee));
	}
}
class Q33Course
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of Modules");
		int num = xyz.nextInt();
		AdvancedModule a[] = new AdvancedModule[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Course Name");
			String courseName = xyz.next();
			System.out.println("Enter Fee");
			int fee = xyz.nextInt();
			System.out.println("Enter duration");
			int duration = xyz.nextInt();
			System.out.println("Enter Extra Fee");
			int extraFee = xyz.nextInt();
			
			a[i] = new AdvancedModule(courseName,fee,duration,extraFee);
		}
		for(int i=0;i<num;i++)
		{
			a[i].show();
		}
	}
}