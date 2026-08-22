/*Question 102: Design a system using abstraction to calculate the area of different shapes such as Circle, Rectangle, and Triangle using runtime polymorphism.
Asked In Practice Assignment
Detailed Description:
Create an abstract class Shape with an abstract method area().
Create subclasses:
Circle ? radius
Rectangle ? length, breadth
Triangle ? base, height
Use constructors to initialize values
Store all objects in a single array of type Shape
Use runtime polymorphism to call area() for each object
Print area based on shape type
Input Format:
First line ? number of shapes n
Next n lines:
Circle ? Circle radius
Rectangle ? Rectangle length breadth
Triangle ? Triangle base height
Input:
3
Circle 3
Rectangle 4 5
Triangle 3 6
Output:
Circle Area: 28.26
Rectangle Area: 20
Triangle Area: 9*/
import java.util.*;
abstract class Shape
{
	abstract void area();
}
class Circle extends Shape
{
	int radius;
	Circle(int radius)
	{
		this.radius = radius;
	}
	void area()
	{
		double area = 3.14*radius*radius;
		System.out.println("Area of Circle: "+area);
	}
}
class Rectangle extends Shape
{
	int length;
	int breadth;
	Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	void area()
	{
		int area = length*breadth;
		System.out.println("Area of Rectangle: "+area);
	}
}
class Triangle extends Shape
{
	int base;
	int height;
	Triangle(int base,int height)
	{
		this.base = base;
		this.height = height;
	}
	void area()
	{
		double area = 0.5 * (base * height);
		System.out.println("Area of Triangle: "+area);
	}
}
class Q102Shape
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Input");
		int n = xyz.nextInt();
		
		Shape a[] = new Shape[n];
		
		for(int i=0;i<n;i++)
		{
			String type = xyz.next();
			
			if(type.equalsIgnoreCase("Circle"))
			{
				int radius = xyz.nextInt();
				a[i] = new Circle(radius);
				
			}
			else if(type.equalsIgnoreCase("Rectangle"))
			{
				int length = xyz.nextInt();
				int breadth = xyz.nextInt();
				
				a[i] = new Rectangle(length,breadth);
				
			}
			else if(type.equalsIgnoreCase("Triangle"))
			{
				int base = xyz.nextInt();
				int height = xyz.nextInt();
				a[i] = new Triangle(base,height);
				
			}
		}
		for(int i=0;i<n;i++)
		{
			a[i].area();
		}
		
		
	}
}