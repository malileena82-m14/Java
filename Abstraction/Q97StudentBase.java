/*Question 97: Abstract class StudentBase.
Asked In Practice Assignment
Store students in array and sort based on marks.

Use sorting logic
Display descending order

Input:

3
Vivek 80
Amit 60
Neha 90

Output:

Neha 90
Vivek 80
Amit 60*/

import java.util.*;
abstract class StudentBase
{
	String name;
	int marks;
	StudentBase(String name,int marks)
	{
		this.name= name;
		this.marks = marks;
	}
}
class Student extends StudentBase
{
	Student(String name,int marks)
	{
		super(name,marks);
	}
}

class Q97StudentBase
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input");
		int n = xyz.nextInt();
		
		StudentBase a[] = new StudentBase[n];
		
		for(int i=0;i<n;i++)
		{
			String name = xyz.next();
			int marks = xyz.nextInt();
			
			a[i] = new Student(name,marks);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i].marks<a[j].marks)
				{
					StudentBase temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i].name+ " " +a[i].marks);
		}
	}
}