/*Q12.Create an Employee POJO class with:
id
name
salary
Store employees in Vector and display employees having salary greater than 25000.
Description
Logical operation:
if(salary > 25000)
Input
1 Raj 20000
2 Simran 30000
3 Ajay 27000
4 Ramesh 18000
Output
Employees with salary above 25000:

2 Simran 30000
3 Ajay 27000*/

package Assignment;
import java.util.*;
public class Assignment12 {
	static class Employee
	{
		private String name;
		private int salary;
		Employee(String name,int salary)
		{
			this.name = name;
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
	}
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector<Employee>v = new Vector<>();
		System.out.println("Enter number of Employee");
		int emp = xyz.nextInt();
		
		for(int i=0;i<emp;i++)
		{
			System.out.println("Enter Employee name");
			String name = xyz.next();
			
			System.out.println("Enter salary");
			int salary = xyz.nextInt();
			
			Employee e = new Employee(name,salary);
			v.add(e);
		}
		System.out.println("Employees with salary above 25000:");
		
		for(Employee e:v)
		{
			if(e.getSalary()>25000)
			{
				System.out.println(e.getName() +" "+ e.getSalary() +" ");
			}
		}
	}

}
