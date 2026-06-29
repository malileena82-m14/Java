/*Question 9: Write a Java program to calculate average of three subject marks using constructor.

Description: Create Result class with three subject marks. Initialize using constructor. Calculate average and display result.
INPUT:
Enter Marks: 70 80 90

OUTPUT:
Average Marks: 80

EXPLANATION:
Create Result class with fields mark1, mark2, mark3. Use constructor public Result(int m1, int m2, int m3) to initialize. 
Calculate average as (m1 + m2 + m3) / 3. Create method displayAverage() to print average. Create object new Result(70, 80, 90) 
and display average.*/

import java.util.*;
class Result
{
	int m1;
	int m2;
	int m3;
	public Result(int m1,int m2,int m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	void display()
	{
		int average = (m1+m2+m3)/3;
		System.out.println("Average Marks :"+average);
	}
}
class ConstResult
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Marks :");
		int m1 = xyz.nextInt();
		int m2 = xyz.nextInt();
		int m3 = xyz.nextInt();
		
		Result r = new Result(m1,m2,m3);
		r.display();
	}
}
