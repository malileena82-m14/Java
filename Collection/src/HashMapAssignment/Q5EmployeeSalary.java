/*Q5. Store Employee Salary
Question
Create a Map containing employee names and salaries. Display all employees whose salary is greater than 50,000.
Explanation
Iterate through entrySet() and apply a condition on the Map value.
Input
Rahul 45000
Amit 60000
Priya 75000
Neha 48000
Output
Amit = 60000
Priya = 75000*/

package HashMapAssignment;
import java.util.*;
public class Q5EmployeeSalary {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		System.out.println("Enter number of Employee");
		int n = xyz.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter employee Name");
			String name = xyz.next();
			
			System.out.println("Enter Employee Salary");
			int sal = xyz.nextInt();
			
			map.put(name, sal);
		}
		for(Map.Entry<String, Integer> m: map.entrySet())
		{
			if(m.getValue()>=50000)
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
	}

}
