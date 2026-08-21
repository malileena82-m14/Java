/*Q17.Create Mobile class:
id
brand
quantity
Store mobiles in Vector and display mobiles with stock less than 10.
Description
Condition:
quantity < 10
Input
1 Samsung 15
2 Vivo 8
3 Oppo 5
4 Apple 20
Output
Low Stock Mobiles:
2 Vivo 8
3 Oppo 5*/

package Assignment;
import java.util.*;
class Mobile
{
	private int id;
	private String brand;
	private int quantity;
	Mobile(int id,String brand,int quantity)
	{
		this.id = id;
		this.brand = brand;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
public class Assignment17 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector<Mobile> v = new Vector<Mobile>();
		System.out.println("Enter input");
		int n = xyz.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter id");
			int id = xyz.nextInt();
			
			System.out.println("Enter brand");
			String brand = xyz.next();
			
			System.out.println("Enter Quantity");
			int quantity = xyz.nextInt();
			
			Mobile m = new Mobile(id,brand,quantity);
			v.add(m);
		}
		System.out.println("Low Stock Mobiles: ");
		for(Mobile m : v)
		{
			if(m.getQuantity()<10)
			{
				System.out.println(m.getId()+" "+m.getBrand()+" "+m.getQuantity());
			}
		}
	}

}
