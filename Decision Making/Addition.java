/*Question 53: Create a Java program to simulate a simple calculator using a switch case. 
It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.
Input:
Number1 = 10
Number2 = 5
Operator = +

Output:
Result = 15

Explanation:
The program uses switch on the operator. When '+' is selected, it performs addition of the two numbers.

Input:
Number1 = 10
Number2 = 4
Operator = %

Output:
Result = 2

Explanation:
The '%' operator calculates the remainder after division. 10 % 4 gives remainder 2.*/
import java.util.*;
class Addition
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		
		int no1 = xyz.nextInt();
		int no2 = xyz.nextInt();
		char op  = xyz.next().charAt(0);
		
		switch(op)
		{
			case '+': System.out.println("Result = "+ (no1 + no2));
			        break;
					
		    case '-': System.out.println("Result = "+ (no1 - no2));
			        break;
					
			case '*': System.out.println("Result = "+ (no1 * no2));
			        break;
					
			case '/': System.out.println("Result = "+ (no1 / no2));
			        break;
					
			case '%': System.out.println("Result = "+ (no1 % no2));
			        break;
					
			
		}
	}
}