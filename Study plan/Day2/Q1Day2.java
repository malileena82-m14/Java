/*1. Write a Java program that demonstrates the standard main method entry point and processes command-line arguments.*/

class Q1Day2
{
	public static void main(String x[])
	{
		int a = Integer.parseInt(x[0]);
		float b = Float.parseFloat(x[1]);
		double c = Double.parseDouble(x[2]);
		char d = x[3].charAt(0);
		
		System.out.println("Integer : "+a);
		System.out.println("Float : "+b);
		System.out.println("Double : "+c);
		System.out.println("Character : "+d);
	}
}