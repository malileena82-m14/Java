/*Question 92: Abstract class Shape with method area().
Asked In Practice Assignment
Create multiple shape classes (Circle, Rectangle).
Use constructor for dimensions
Store objects in Shape array
Apply runtime polymorphism
Calculate area for each shape

Input:
3
Circle 3
Rectangle 4 5
Circle 2

Output:
Circle Area: 28.26
Rectangle Area: 20
Circle Area: 12.56*/

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
		System.out.println("Circle Area: "+(3.14*radius*radius));
	}
}
class Rectangle extends Shape
{	
	int len;
	int bre;
	Rectangle(int len,int bre)
	{
		this.len = len;
		this.bre = bre;
	}
	void area()
	{
		System.out.println("Rectangle Area: "+(len*bre));
	}
}
class Q92Shape
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input");
		int n  = xyz.nextInt();
		Shape a[] = new Shape[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter shape");
			String type = xyz.next();
			if(type.equalsIgnoreCase("Circle"))
			{
				System.out.println("Circle radius");
			    double radius = xyz.nextDouble();
				a[i] = new Circle(radius);
			}
			else if(type.equalsIgnoreCase("Rectangle"))
			{
				System.out.println("Rectangle length");
				int len = xyz.nextInt();
			
				System.out.println("Rectangle Breadth");
				int bre = xyz.nextInt();
			
				a[i] = new Rectangle(len,bre);
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		for(int i=0;i<n;i++)
		{
			a[i].area();
		}
	}
}