/*Q20.Create Laptop class:
id
brand
price
Store laptops in Vector and display laptops of brand Dell.
Description
Logical condition:
brand.equals("Dell")
Input
1 Dell 55000
2 HP 60000
3 Dell 72000
4 Lenovo 50000
Output
Dell Laptops:
1 Dell 55000
3 Dell 72000*/

package Assignment;
import java.util.*;
class Laptop
{
	private int id;
	private String brand;
	private int price;
	
	Laptop(int id,String brand,int price)
	{
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class Assignment20 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector<Laptop> v = new Vector<Laptop>();
		System.out.println("Enter input");
		int n = xyz.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter id");
			int id = xyz.nextInt();
			
			System.out.println("Enter Brand");
			String brand = xyz.next();
			
			System.out.println("Enter price");
			int price = xyz.nextInt();
			
			Laptop l = new Laptop(id,brand,price);
			v.add(l);
		}
		System.out.println("Enter Search name");
		String skey = xyz.next();
		for(Laptop l:v)
		{
			if(l.getBrand().equals(skey))
			{
				System.out.println(l.getId()+" "+l.getBrand()+" "+l.getPrice());
			}
		}
	}

}
