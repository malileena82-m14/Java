/*Question 42: Employee salary hike based on performance and years of service:
? Input: Basic salary, Years of service, Performance rating (1–5)
? Logic:
? If rating >= 4 and service > 5 yrs ? 20% hike
? Else if rating >= 3 ? 10%
? Else ? 5%
? Output: New salary.
Input
Basic Salary
Years of Service
Performance Rating (1–5)

Example Input:
Basic Salary = 30000
Years of Service = 6
Rating = 4

Logic
If rating ? 4 and service > 5 years ? 20% hike
Else if rating ? 3 ? 10% hike
Else ? 5% hike

Output
New Salary = 36000

Explanation
Since rating is 4 and service is more than 5 years, employee gets 20% hike.
20% of 30000 = 6000
New Salary = 30000 + 6000 = 36000*/

import java.util.*;
class Service
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter basic salary, Years of service, Performance Rating ");
		
		int basic = xyz.nextInt();
		int Service = xyz.nextInt();
		int rating = xyz.nextInt();
		int hike;
		
		if(rating >= 4 && Service>5)
		{
			hike = (basic*20)/100;
		}
		else if(rating >= 3)
		{
			hike = (basic*10)/100;
		}
		else
		{
			hike = (basic*5)/100;
		}
		
		int newsalary = hike + basic;
		System.out.println("New Salary = "+ newsalary);
	}
}