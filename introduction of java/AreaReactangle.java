/*
Question 4: Write a Java program to enter length and breadth of a rectangle and calculate its area.
Input:
Length = 10
Breadth = 5

Output:
Area = 50
*/

class AreaRectangle
{
	public static void main(String x[])
	{
		int l = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		int Area = l*b;
		
		System.out.println("Area of Rectangle =" + Area);
	}
}