/*
Question 54: Write a Java expression using arithmetic and assignment operators to calculate net salary.
Input:
Basic Salary = 35000
Tax Rate = 12%

Output:
Net Salary = 30800

Explanation:
Tax amount = 12% of 35000 = 4200
Net Salary = 35000 ? 4200 = 30800.
*/

import java.util.*;
class NetSalary
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int Basic = xyz.nextInt();
		int Tax = xyz.nextInt();
		Tax = (Basic*Tax)/100;
		int Net = Basic - Tax;
		
		System.out.println("Net Salary = "+ Net);
	}
}