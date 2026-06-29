/*Question 58: Write a program to input an employee level (1-3) and display the salary range:
? 1: Junior (20,000 - 30,000)
? 2: Mid (31,000 - 50,000)
? 3: Senior (51,000 - 80,000)
Input
Level = 2

Output:
Mid (31,000 - 50,000)

Explanation:
Level 2 represents Mid-level employee. The program prints its salary range.*/
import java.util.*;
class Range
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the level");
		
		int r = xyz.nextInt();
		
		switch(r)
		{
			case 1: System.out.println("Junior (20000 - 30000)");
			break;
			case 2: System.out.println("Mid (31000 - 50000)");
			break;
			case 3: System.out.println("Senior (51000 - 80000)");
			break;
			default:System.out.println("invalid salary");
			break;
		}
	}
}