/*Question 37: Write a Java program to input cost price and selling price and determine profit or loss.
Input:
Cost Price = 500
Selling Price = 650

Output:
Profit

Explanation:
If selling price > cost price ? Profit
If selling price < cost price ? Loss
If both are equal ? No Profit No Loss
*/
import java.util.*;
class Price
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int cp = xyz.nextInt();
		int sp = xyz.nextInt();
		
		System.out.println(sp>cp ? "profit": sp<cp? "Loss":"No profit no loss");
	}
}