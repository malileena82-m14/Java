/*Q19.Create Order class:
orderId
customerName
amount
Store orders in Vector and find highest order amount.
Description
Logic:
if(amount > max)
max = amount;
Input
1 Ram 2500
2 Sita 4200
3 Mohan 3100
Output
Highest Order Amount = 4200*/

package Assignment;
import java.util.*;
class Order
{
	private int orderId;
	private String customerName;
	private int amount;
	
	Order(int orderId,String customerName,int amount)
	{
		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
public class Assignment19 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector<Order> v = new Vector<Order>();
		
		System.out.println("Enter input");
		int n = xyz.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Order Id");
			int orderId = xyz.nextInt();
			
			System.out.println("Enter CustomerName");
			String customerName = xyz.next();
			
			System.out.println("Enter Amount");
			int amount = xyz.nextInt();
			
			Order o = new Order(orderId,customerName,amount);
			v.add(o);
		}
		System.out.println("Output");
		int max = 0;
		for(Order o:v)
		{
			if(o.getAmount()>max)
			{
				max =  o.getAmount();
			}
		}
		System.out.println("Highest Order Amount = "+max);
		
	}

}
