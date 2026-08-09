/*Question 84: abstract class Shape with method area(). Create Circle class
Asked In Practice Assignment
Description:
Store multiple circles in array and calculate area using constructor values.

Input:

Enter number of circles: 2
3
5

Output:

Area1: 28.26
Area2: 78.5*/

import java.util.*;
abstract class Shape
{
	abstract void area();
}
class Circle extends Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius = radius;
	}
	void area()
	{
		double area = 3.14*radius*radius;
		System.out.println("Area : "+area);
	}
}
class Q84Shape
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of Circle");
		int n = xyz.nextInt();
		
		Shape s[] = new Shape[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter radius of circles");
			double radius = xyz.nextDouble();
			
			s[i] = new Circle(radius);
		}
		for(int i=0;i<n;i++)
		{
			s[i].area();
		}
	}
}