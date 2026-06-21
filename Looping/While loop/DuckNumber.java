/*Question 23: Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.
Input:

Number = 3210

Output:

Duck Number

Explanation:

The number contains zero and does not start with zero.
Therefore, it is a Duck Number*/

import java.util.*;

class DuckNumber
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

        int num = sc.nextInt();//3210
        int temp = num; //3210
        int count = 0;

        while (temp >= 10) //3210>=10
		{
            temp = temp / 10; // 3210/10 = 321
        }

        if (temp == 0) // 321==0 conditon false
		{
            System.out.println("Not a Duck Number");
            return;
        }

        temp = num; //3=3210

        
        while (temp > 0)//3210>0
		{
            int d = temp % 10; //3210%10= 0

            if (d == 0) //0==0
			{
                count++;//1
                break;
            }

            temp = temp / 10;//3210/10=321
        }

        if (count > 0) 
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");
    }
}