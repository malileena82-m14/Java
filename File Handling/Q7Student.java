/*Question 7: Write a Java program to check whether file exists or not.
Asked In Practice Assignment
Input:
Input filename:
student.txt

Output:
File exists
OR
File does not exist

Explanation:
Create File object with filename as parameter. Use exists() method which returns boolean value. 
Returns true if file exists at specified path, false if file does not exist. Also can use isFile() method 
to verify if path refers to actual file. Use if-else statement to display appropriate message based on existence check result.*/

import java.io.*;
import java.util.*;
class Q7Student
{
	public static void main(String x[])throws IOException
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Input filename");
		String filename = xyz.nextLine();
		File f = new File(filename);
		if(f.exists())
		{
			System.out.println("File Exists");
		}
		else
		{
			System.out.println("File does not exist");
		}
	}
}