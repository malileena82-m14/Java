/*
Question 7: Write a Java program to convert temperature from Fahrenheit to Celsius.
Input:
Fahrenheit = 98

Output:
Celsius = 36.67

Explanation:
The formula used is:
C = (F ? 32) × 5 / 9
Applying the formula gives the Celsius temperature.
*/

class Temparature
{
	public static void main(String x[])
	{
		int F = Integer.parseInt(x[0]);
		
		System.out.println("fahrenheit to celsius =" + ((F - 32)*5/9));
	}
}