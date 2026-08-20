/*Question 88: Create an abstract class with method getGrade().
Asked In Practice Assignment
Design a system where student marks are stored using a POJO class with a constructor.
Use an abstract class to define grade calculation logic. Store marks in an array of Student objects
Implement grading logic:
Marks ? 70 ? Grade A
Marks ? 40 ? Grade B
Else ? Grade C
Use abstraction to enforce grade calculation. Loop through array and print grade for each student

Input:
3
78
45
30

Output:
Grade: A
Grade: B
Grade: C*/

import java.util.*;
abstract class Student
{
	abstract void getGrade();
}
class Marks extends Student
{
	private int marks;
	Marks(int marks)
	{
		this.marks = marks;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	public int getMarks()
	{
		return marks;
	}
	void getGrade()
	{
		if(marks>=70)
		{
			System.out.println("Grade: A");
		}
		else if(marks>=40)
		{
			System.out.println("Grade: B");
		}
		else
		{
			System.out.println("Grade: c");
		}
	}
}
class Q88Student
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Marks");
		int n = xyz.nextInt();
		Student a[] = new Student[n];
		for(int i=0;i<n;i++)
		{
			int marks = xyz.nextInt();
			a[i] = new Marks(marks);
		}
		for(int i=0;i<n;i++)
		{
			a[i].getGrade();
		}
	}
}


