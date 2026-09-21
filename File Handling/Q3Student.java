/*Question 3: Write a Java program to count total characters in a file.
Asked In Practice Assignment
Input:
File content:
Java Programming

Output:
Total characters = 17

Explanation:
Open file using FileReader to read character by character. Initialize counter to zero. Use read() method in loop to read 
each character including spaces. Increment counter for every character read. When read() returns -1, file end is reached. 
Count includes all characters: letters, digits, spaces, and special characters. Display final count.*/

import java.util.*;
import java.io.*;
class Q3Student
{
	public static void main(String x[])throws IOException
	{
		Scanner xyz = new Scanner(System.in);
		FileWriter fw = new FileWriter("student.txt");
		System.out.println("File Content");
		String data = xyz.nextLine();
		fw.write(data);
		fw.close();
		
		FileReader fr = new FileReader("student.txt");
		
		int count =0;
		
		while(fr.read()!= -1)
		{
			count++;
		}
		fr.close();
		System.out.println("Total Characters = "+count);
	}
}