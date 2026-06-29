/*Q5. Write a java program to find the total number of notes in a given amount.  
            Enter the amount: 2528 
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1*/

import java.util.*;
class Q5java
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the total Amount");
		
		int a = xyz.nextInt();
		int rem;
		
		int n500 = a/500;//500
			rem = a%500;//28
			
		int n100 = rem/100;//0
			rem = rem%100;//28
			
		int n50 = rem/50;//0
			rem = rem%50;//28
			
		int n20 = rem/20;//1
			rem = rem%20;//8
			
		int n10 = rem/10;//0
			rem = rem%10;//8
			
		int n5  = rem/5;//1
		    rem = rem%5;//3
			
		int n2  = rem/2;//1
			rem = rem%2;//1
			
		System.out.println("500 = "+n500 + "\n100 = "+n100 + "\n50 = "+n50 + "\n20 = "+n20 + "\n10 = "+n10 + "\n5 = "+n5 + "\n2 = "+n2 + "\n1 = "+rem);
		
		
	}
}