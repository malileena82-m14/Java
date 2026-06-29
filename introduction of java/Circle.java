/*
Question 5: Write a Java program to enter the radius of a circle and calculate its diameter, area, and circumference.
Input:
Radius = 7

Output:
Diameter = 14
Area = 153.86
Circumference = 43.96

Explanation:
Diameter = 2 × radius
Area = ? × r²
Circumference = 2 × ? × r
The formulas are applied using the given radius.
*/

class Circle
{
	public static void main(String x[])
	{
		int radius = Integer.parseInt(x[0]);
		int diameter = 2*radius;
		double area = 3.14*radius*radius;
		double circumference = 2*3.14* radius;
		
		System.out.println("Diameter = " + diameter);
		System.out.println("Area = " + area);
		System.out.println("Circumference = " + circumference);
		
	}
}
