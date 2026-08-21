/*Q13.Create Product class:
productId
productName
price
Store products in Vector and display products with price less than 500.
Description
Check condition:
price < 500
Input
P1 Mouse 450
P2 Keyboard 700
P3 PenDrive 350
P4 Monitor 9000
Output
Products below 500:

P1 Mouse 450
P3 PenDrive 350*/
package Assignment;
import java.util.*;
 class Product{
	private int productId;
	private String productName;
	private int price;
	
	Product(int productId,String productName,int price)
	{
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class Assignment13 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector <Product> v = new Vector<>();
		System.out.println("Enter number of Product");
		int prod = xyz.nextInt();
		
		for(int i=0;i<prod;i++)
		{
			System.out.println("Enter Product Id");
			int productId = xyz.nextInt();
			xyz.nextLine();
			
			System.out.println("Enter Product Name");
			String productName = xyz.next();
			
			System.out.println("Enter Product Price");
			int price = xyz.nextInt();
			
			Product p = new Product(productId,productName,price);
			v.add(p);
		}
		System.out.println("Products below 500:");
		for(Product p:v)
		{
			if(p.getPrice()<500)
			{
				System.out.println(p.getProductId()+ "\t"+ p.getProductName()+ "\t"+ p.getPrice());
			}
		}
	}

}
