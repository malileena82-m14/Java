/*Question 75: Create abstract class Shipping.
Asked In Practice Question
Abstract method calculateShipping().
Subclasses:

StandardShipping

ExpressShipping

Input
Weight: 3
Rate: 100
Output
Shipping Cost: 300*/

import java.util.*;
abstract class Shipping
{
	int weight;
	int rate;
	Shipping(int weight,int rate)
	{
		this.weight = weight;
		this.rate = rate;
	}
	abstract void calculateShipping();
}
class StandardShipping extends Shipping
{
	StandardShipping(int weight,int rate)
	{
		super(weight,rate);
	}
	void calculateShipping()
	{
		System.out.println("Shipping Cost: "+(weight*rate));
	}
}
class ExpressShipping extends Shipping
{
	ExpressShipping(int weight,int rate)
	{
		super(weight,rate);
	}
	void calculateShipping()
	{
		System.out.println("Shipping Cost: "+(weight*rate));
	}
}
class Q75Shipping
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.StandardShipping");
		System.out.println("2.ExpressShipping");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Shipping s;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Weight");
				int weight = xyz.nextInt();
				System.out.println("Enter Rate");
				int rate = xyz.nextInt();
				s = new StandardShipping(weight,rate);
				s.calculateShipping();
				break;
				
			case 2:
				System.out.println("Enter Weight");
				int weight1 = xyz.nextInt();
				System.out.println("Enter Rate");
				int rate1 = xyz.nextInt();
				s = new StandardShipping(weight1,rate1);
				s.calculateShipping();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}