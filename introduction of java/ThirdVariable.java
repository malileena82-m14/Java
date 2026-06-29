/*Question 14: Write a Java program to swap two numbers using a third variable.
Input:
A = 5
B = 10

Output:
A = 10
B = 5

Explanation:
A temporary variable is used to store one value while swapping the numbers.
*/

import java.util.*;
class ThirdVariable
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two number");
		
		int temp,A,B;
		A = xyz.nextInt();
		B = xyz.nextInt();
		
		temp = A;
		A = B;
		B = temp;
		
		System.out.println("A =" + A + "B ="+ B );
	}		
}