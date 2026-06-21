/*Question 20: Write a java program to swap first and last digits of a number.
Input:

Number = 1234

Output:

Swapped Number = 4231

Explanation:

First digit (1) and last digit (4) are interchanged.
Middle digits remain the same.*/
import java.util.*;
class Swap
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = xyz.nextInt();//1234
		int temp = num; //1234
		int last = num%10; // 1234%10 = 4
		
		int first = num; // 1234
		while(first>=10) //1234>=10 , 123>=10 , 12>=10condition is true
		{
			first = first/10; // 1234/10= 123,  123/10 =12,  12/10=1
		}
		
		int divisor = 1;
		temp = num; //1234=1234
		
		while(temp>=10) //1234>=10  , 123>=10 , 12>=10condition is true
		{
			divisor = divisor*10; // 1*10 =10 ,10*10=100, 100*10=1000 
			temp = temp/10;// 1234/10= 123 , 123/10= 12 , 12/10=1
		}
		int middle = (num%divisor)/10;// (1234%1000)/10 =23
		int swapped = last*divisor + middle*10 + first; 
					//  4 *1000    + 23    *10 + 1    ==4321
		System.out.println("Sawpped Number = "+ swapped);//4321
	}
}