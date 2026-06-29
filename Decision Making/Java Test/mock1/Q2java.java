/*Q2. Write a Java program to reverse a number without using loop.  
Input a number: 123  
Reverse number: 321 */

import java.util.*;
class Q2java
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number"); //123
		
		int n = xyz.nextInt();
		int rev = (n%10)*100 + ((n/10)%10)*10 + (n/100);
		     //     3        +   2            + 1    
		System.out.println("Reverse Number = "+ rev);//321
	}
}