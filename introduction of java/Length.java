/*
Question 6: Write a Java program to convert length from centimeter into meter and kilometer.'
Input:
Centimeter = 150
Output:
Meter = 1.5
Kilometer = 0.0015
Explanation:
1 meter = 100 centimeters
1 kilometer = 100000 centimeters
The given value is converted using standard unit conversion formulas.
*/

class length
{
	public static void main(String x[])
	{
		int c = Integer.parseInt(x[0]);
		float m = c/100;
		double k = c*m/100000;
		
		System.out.println("Meter = " + m );
		System.out.println( "Kilometer =" + k);
	}
}