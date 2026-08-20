/*Question 91: Create abstract class Device with method showDetails().
Asked In Practice Assignment
Create POJO class Mobile with brand and price.
Use constructor
Store objects in array
Display details using abstraction

Input:
2
Samsung 20000
Apple 80000

Output:
Mobile: Samsung Price: 20000
Mobile: Apple Price: 80000*/

import java.util.*;
abstract class Device
{
	abstract void showDetails();
}
class Mobile extends Device
{
	private String brand;
	private int price;
	Mobile(String brand,int price)
	{
		this.brand = brand;
		this.price = price;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	void showDetails()
	{
		System.out.println("Mobile: "+brand+ " Price: "+price);
	}
}
class Q91Device
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Input");
		int n = xyz.nextInt();
		
		Device a[] = new Device[n];
		for(int i=0;i<n;i++)
		{
			String brand = xyz.next();
			int price = xyz.nextInt();
			a[i] = new Mobile(brand,price);
		}
		for(int i=0;i<n;i++)
		{
			a[i].showDetails();
		}
	}
} 