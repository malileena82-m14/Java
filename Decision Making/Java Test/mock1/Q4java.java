/*Q4.Take a three-digit number and print whether the middle digit is greater than the sum of the 
first and last digits using the conditional & ternary operator. 
 
Example: 
• Input: num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater 
• Input: num = 853 → Middle digit 5 vs (8+3)=11 → Not Greater*/

import java.util.*;
class Q4java
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		int first,last,sum,m;
		first = n;
		
		first = n/100;//5
		last  = n%10;//2
		m     = n%100; 
		sum = first + last;
		
	    String msg = ((m==sum) ? "Equal" : (m<sum) ? "Not greater" : "greater");
		System.out.println(msg);
	}
}