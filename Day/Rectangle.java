/*WAP a java program to find the area of a rectangle*/

import java.util.*;
class Rectangle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int l = xyz.nextInt();
		int b = xyz.nextInt();
		int a = l*b;
		
		System.out.println("Area of Rectangle ="+ a);
	}
}