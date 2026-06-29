/*
Question 44: Write a Java program to calculate gross salary based on basic salary conditions.
Input:
Basic Salary = 18000

Output:
Gross Salary = 34650

Explanation:
Gross salary is calculated by adding HRA and DA to the basic salary according to the given salary slab conditions.
*/
import java.util.*;
class GrossSalary
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		int Basic = xyz.nextInt();
		int HRA = xyz.nextInt();
		int DA = xyz.nextInt();
		HRA = (Basic*HRA)/100;
		DA= (Basic*DA)/100;
		
		System.out.println("gross Salary = "+ (Basic+ HRA +DA));
	}
}
