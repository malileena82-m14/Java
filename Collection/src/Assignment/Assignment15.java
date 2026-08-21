/*Q15.Create Book class:
bookId
bookName
price
Store books in Vector and calculate total price of all books.
Description
Logical operation:
total = total + price
Input
1 Java 500
2 SQL 350
3 Python 400
Output
Total Book Price = 1250*/

package Assignment;
import java.util.*;
class Book
{
	private int bookId;
	private String bookName;
	private int price;
	Book(int bookId,String bookName,int price)
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class Assignment15 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector<Book> v = new Vector<Book>();
		
		System.out.println("Enter Input");
		int n = xyz.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Book id");
			int id = xyz.nextInt();
			
			System.out.println("Enter Book  Name");
			String bookName = xyz.next();
			
			System.out.println("Enter Price");
			int price = xyz.nextInt();
			
			Book b = new Book(id,bookName,price);
			
			v.add(b);
		}
		int total =0;
		for(Book b:v)
		{
			total = total+b.getPrice();
		}
		System.out.println("Total Price: "+total);
	}

}
