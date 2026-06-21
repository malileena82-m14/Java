/*Q8. Write a program to check traingle is equilatral , isoscale or scalene. */

import java.util.*;
class Q8java
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the side");
		
		int a = xyz.nextInt(); //2
		int b = xyz.nextInt();//2
		int c = xyz.nextInt();//2
		
		if(a==b && b==c && a==c) //condition true
		{
			System.out.println("Triangle is Equilateral"); //print
		}
		else if(a==b || b==c || a==c)
		{
			System.out.println("Triangle is Isoscale");
		}
		else
		{
			System.out.println("Triangle is Scalene");
		}
	}
}