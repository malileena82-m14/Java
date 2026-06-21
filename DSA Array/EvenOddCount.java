/*Question 5: Write a Java program to count even & odd values from an array.
Input:
Array Size = 7
Array Elements = 12 17 24 39 40 55 70
Output:
Count of Even Values = 4
Count of Odd Values = 3
Explanation:
? Initialize counters: evenCount = 0, oddCount = 0.
? For each element in the array:

? If divisible by 2 ? increase evenCount.
? Otherwise ? increase oddCount.

? Final counts are displayed.*/
import java.util.*;
class EvenOddCount
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter the Array Size");
		int size = xyz.nextInt();
		int a[] = new int[size];
		int evencnt=0;
		int oddcnt=0;
		
		System.out.println("Enter the Element");
		
		for(int i=0;i<size;i++)
		{
			a[i] = xyz.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				evencnt++;
			}
		}
		System.out.println("Even count = "+evencnt);
		for(int i=0;i<size;i++)
		{
			if(a[i]%2!=0)
			{
				oddcnt++;
			}
		}
		System.out.println("Odd count = "+oddcnt);
	}
}