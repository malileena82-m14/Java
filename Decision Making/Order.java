/*Question 61: Create a Java program to simulate a basic food ordering system using switch:
1: Burger
2: Pizza
3: Pasta
4: Sandwich
Display the price for the selected item.
Input:
Choice = 1

Output:
Burger - ?120

Explanation:
Case 1 represents Burger and prints its price.

Input:
Choice = 5

Output:
Invalid Selection

Explanation:
Since 5 is not in menu, default case executes.*/
import java.util.*;
class Order
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the item");
		
		int n = xyz.nextInt();
		
		switch(n)
		{
			case 1:System.out.println("Burger = 120");
			break;
			case 2:System.out.println("Pizza = 200");
			break;
			case 3:System.out.println("Pasta = 100");
			break;
			case 4:System.out.println("Sandwich = 80");
			break;
			
			default:System.out.println("Invalid Selection");
			break;
			
		}
	}
}