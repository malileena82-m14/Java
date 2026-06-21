/*Q3. Write a java program to Check Number Is Spy Number or Not without using loop.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product 
of all digits. 
     Input : 1412 
     Output : Spy Number */
	 
import java.util.*;
class Q3java
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = xyz.nextInt();
		
		int sum = (n/1000) + ((n%1000)/100) + (n/1000) + (n%10) ;
		        //  1      +    4           +  1       +   2
				
		int product = (n/1000) * ((n%1000)/100) * (n/1000) * (n%10) ;
		
		System.out.println(sum==product ? "spy number": "not spy number");
	}
}