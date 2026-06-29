/*Q6. Write a java program to merge of two given array. 
Input :- First Array :- 1 2 3 4 5 
               Second Array :-  6 7 8 9 10  
 Output :- 1 10 2 9 3 8 4 7 5 6*/
 
import java.util.*;
class Q6
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[a.length+b.length];
		System.out.println("Enter Array1");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Enter Array2");
		for(int i=0;i<b.length;i++)
		{
			b[i] = xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{   
			
			  c[i] = a[i];
		}
		int k=a.length;
		for(int i=0;i<b.length;i++,k++)
		{   
			  c[k] = b[i];
			
		}
		System.out.println("output = ");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(" "+c[i]);
		}
	
		
	}
}