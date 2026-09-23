/*Question 6: Write a Java program to append data into an existing file.
Asked In Practice Assignment
Input:
Existing file contains:
Rahul 78
New data to append:
Amit 85

Output:
Data appended successfully.

Explanation:
Create FileWriter with filename and append parameter set to true. FileWriter(filename, true) 
opens file in append mode. When append is true, new data adds at file end without overwriting existing content. 
When false (default), file content is overwritten. Write new data using write() method. Close FileWriter 
to save appended data. Previous content is preserved.*/

import java.io.*;
import java.util.*;
class Q6Student
{
	public static void main(String x[])throws IOException
	{
		Scanner xyz = new Scanner(System.in);
		FileWriter fw = new FileWriter("student.txt");
		fw.write("Rahul 78 \n");
		fw.close();
		
		System.out.println("New Data");
		String data = xyz.nextLine();
		FileWriter fw1 = new FileWriter("student.txt",true);
		fw1.write(data+"\n");
		fw1.close();
		
		System.out.println("Data append successfully");
	}
}