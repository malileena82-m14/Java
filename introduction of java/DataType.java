/*Question 2: Write a Java program to input all basic data types (int, float, double, char, boolean) and print their values.
Input:
int = 10
float = 5.5
double = 99.99
char = A
boolean = true

Output:
10
5.5
99.99
A
true*/

class DataType
{
	public static void main(String x[])
	{
		int i = Integer.parseInt(x[0]);
		float f = Float.parseFloat(x[1]);
		double d = Double.parseDouble(x[2]);
		char ch = x[3].charAt(0);
		boolean b = Boolean.parseBoolean(x[4]);
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(b);
	}
}


/*import java.util.*;
class Datatype
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Integer Number");
		int i = xyz.nextInt();
		
		System.out.println("Enter Float Number");
		float f = xyz.nextFloat();
		
		System.out.println("Enter Double Number");
		double d = xyz.nextDouble();
		
		System.out.println("Enter Character ");
		char ch = xyz.next().charAt(0);
		
		System.out.println("Enter boolean");
		boolean b = xyz.nextBoolean();
		
		System.out.println("Output");
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(b);
	}
}*/