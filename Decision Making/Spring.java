/*Question 60: Write a program using switch that takes a number (1-4) and displays a season:
1: Spring
2: Summer
3: Autumn
4: Winter
Input:
Number = 2

Output
Summer

Explanation:
Switch matches case 2 and prints “Summer"*/
import java.util.*;
class Spring
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		
		switch(n)
		{
			case 1:System.out.println("Spring");
			break;
			case 2:System.out.println("Summer");
			break;
			case 3:System.out.println("Autumn");
			break;
			case 4:System.out.println("Winter");
			break;
			default:System.out.println("it is not season");
			break;
			
		}
	}
}