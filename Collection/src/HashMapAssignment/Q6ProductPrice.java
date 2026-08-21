/*Q6. Find a Product Price
Question
Create a Map containing product names and prices. Accept a product name and display its price.
Explanation
Use get() to retrieve the value associated with the product key.
Input
Laptop = 55000
Mobile = 25000
Tablet = 18000

Search: Mobile
Output
Mobile Price = 25000*/

package HashMapAssignment;
import java.util.*;
public class Q6ProductPrice {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		System.out.println("Enter number of product");
		int n = xyz.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Product Name");
			String name = xyz.next();
			
			System.out.println("Enter Price");
			int price = xyz.nextInt();
			
			map.put(name, price);
		}
		System.out.println("Enter Search");
		String str = xyz.next();
		
		int price = map.get(str);
		System.out.println(str+ " Price "+price );
	}

}
