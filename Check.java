/*WAP to check whether a number is even or odd*/

import java.util.*;
class Check
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int no = xyz.nextInt();
		System.out.println(no%2==0 ? "Even": "Odd");
	}
}