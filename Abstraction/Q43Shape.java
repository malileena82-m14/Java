/*Question 43: Create an abstract class Shape to calculate area of different shapes.
Asked In Practice Question
Create abstract class Shape with:

Abstract method calculateArea()

Create subclasses:

Circle ? area = ? * r * r

Rectangle ? area = length * width

Program should take input and calculate respective area.

Input
Shape: Circle
Radius: 5
Output
Area of Circle: 78.5*/

import java.util.*;
abstract class Shape
{
	abstract void calculateArea();
}
class Circle extends Shape
{
	int radius;
	Circle(int radius)
	{
		this.radius = radius;
	}
	void calculateArea()
	{
		double area = 3.14*radius*radius;
		System.out.println("Area of Circle: "+area);
	}
}
class Rectangle extends Shape
{
	int length,width;
	Rectangle(int length,int width)
	{
		this.length = length;
		this.width = width;
	}
	void calculateArea()
	{
		int area = length * width;
		System.out.println("Area of Rectangle: "+area);
	}
}
class Q43Shape
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Shape s;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Radius");
				int radius = xyz.nextInt();
				
				s = new Circle(radius);
				s.calculateArea();
				break;
				
			case 2:
				System.out.println("Enter Length");
				int length = xyz.nextInt();
				
				System.out.println("Enter width");
				int width = xyz.nextInt();
				
				s = new Rectangle(length,width);
				s.calculateArea();
				break;
				
			default:
				System.out.println("Wrong Choice");
		}
	}
	
}