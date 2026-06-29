/*Question 27: Write a java program to input marks of five subjects Physics, Chemistry, Biology,
       Mathematics and Computer, calculate percentage and grade according to given conditions:
                    percentage >= 90% : Grade A
                    percentage >= 80% : Grade B
                    percentage >= 70% : Grade C
                    percentage >= 60% : Grade D
                    percentage >= 40% : Grade E
                    percentage < 40% : Grade F
Input:
Physics = 85
Chemistry = 80
Biology = 75
Mathematics = 90
Computer = 70

Output:
Percentage = 80%
Grade = B

Explanation:
Total Marks = 85 + 80 + 75 + 90 + 70 = 400
Percentage = 400 / 5 = 80%
Since percentage is 80%, Grade B is assigned.*/
import java.util.*;
class Subject
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the subject marks");
		
		int p,c,b,m,comp;
		p = xyz.nextInt();
		c = xyz.nextInt();
		b = xyz.nextInt();
		m = xyz.nextInt();
		comp = xyz.nextInt();
		
		int total = p+c+b+m+comp;
		int percentage = total/5;
		
		System.out.println("Total = "+total + "\npercentage = "+percentage);
		
		if(percentage >= 90)
		{
			System.out.println("Grade A");
		}
		else if(percentage >= 80)
		{
			System.out.println("Grade B");
		}
		else if(percentage >= 70)
		{
			System.out.println("Grade C");
		}
		else if(percentage >= 60)
		{
			System.out.println("Grade D");
		}
		else if(percentage >= 40)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Grade F");
		}
		
	}
}