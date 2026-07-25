/*Question 48: Create abstract class Student to calculate grades.
Asked In Practice Question
Abstract method calculateGrade().
Subclasses:

SchoolStudent

CollegeStudent

Grade based on marks.

Input
Type: School
Marks: 85
Output
Grade: A*/

import java.util.*;
abstract class Student
{
	int marks;
	Student(int marks)
	{
		this.marks = marks;
	}
	abstract void calculateGrade();
}
class SchoolStudent extends Student
{
	SchoolStudent(int marks)
	{
		super(marks);
	}
	void calculateGrade()
	{
		if(marks>=80)
		{
			System.out.println("Grade: A");
		}
		else if(marks>=60)
		{
			System.out.println("Grade: B");
		}
		else
		{
			System.out.println("Grade: C");
		}
	}
}
class CollegeStudent extends Student
{
	CollegeStudent(int marks)
	{
		super(marks);
	}
	void calculateGrade()
	{
		if(marks>=80)
		{
			System.out.println("Grade: A");
		}
		else if(marks>=60)
		{
			System.out.println("Grade: B");
		}
		else
		{
			System.out.println("Grade: C");
		}
	}
}
class Q48Student
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Type");
		System.out.println("1.School Student");
		System.out.println("2.College Student");
		int choice = xyz.nextInt();
		
		System.out.println("Marks");
		int marks = xyz.nextInt();
		
		Student s;
		
		switch(choice)
		{
			case 1:
				s = new SchoolStudent(marks);
				s.calculateGrade();
				break;
				
			case 2:
				s = new CollegeStudent(marks);
				s.calculateGrade();
				break;
				
			default:
				System.out.println("Invalid Choice");
		}
	}
}