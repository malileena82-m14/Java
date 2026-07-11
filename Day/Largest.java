/*WAP to find the largest of three numbers*/

import java.util.*;
class Largest
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		int c = xyz.nextInt();
		
		System.out.println((a>b)?(a>c? a : c):(b>c? b:c));
	}
}