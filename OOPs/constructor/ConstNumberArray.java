/*Question 6: Write a Java program to store 5 numbers in an array using constructor and find maximum number.

Description: Create NumberArray class having an integer array. Initialize array using constructor. Find maximum 
number using logic.
INPUT:
Enter 5 numbers: 10 45 22 89 34

OUTPUT:
Maximum number is: 89

EXPLANATION:
Create NumberArray class with int[] array field. Use constructor public NumberArray(int[] nums) to initialize array. 
Create method findMax() to find maximum using loop. Compare each element and store maximum. Display maximum value.*/

import java.util.*;
class NumberArray
{
	int num[];
	
	public NumberArray(int num[])
	{
		this.num = num;
	}
	void display()
	{
		int max=0;
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i])
			{
				max = num[i];
			}
		}
		System.out.println("Maximum Number is :"+max);
	}
}
class ConstNumberArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers :");
		int num[] = new int[5];
		
		for(int i=0;i<num.length;i++)
		{
			num[i] = xyz.nextInt(); 
		}
		
		NumberArray num1 = new NumberArray(num);
		
		num1.display();
		
	}
}
