/*Question 8: Write a Java program to display file size.
Asked In Practice Assignment
Input:
Input filename:
student.txt

Output:
File size = 120 bytes

Explanation:
Create File object with filename. Use length() method which returns file size in bytes as long value. 
Check if file exists before calling length() using exists() method. For larger files, convert bytes to KB 
by dividing by 1024, to MB by dividing by 1024*1024. If file not found, length() returns -1 or throws exception. 
Display file size with appropriate unit.*/

import java.util.*;
import java.io.*;
class Q8Student
{
	public static void main(String x[])throws IOException
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Input FileName");
		String name = xyz.nextLine();
		File f = new File(name);
		
		if(f.exists() && f.isFile())
		{
			long size = f.length();
			System.out.println("File Size = "+size+" bytes");
		}
		else 
		{
			System.out.println("File does not exists");
		}
	}
}