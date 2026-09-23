/*Question 5: Write a Java program to count total lines in a file.
Asked In Practice Assignment
Input:
File content:
Java
Python
C++

Output:
Total lines = 3

Explanation:
Use BufferedReader to read file. Initialize line counter to zero. Loop continuously using readLine() 
method to read each line. Increment counter for each non-null line read. When readLine() returns null, end of file reached, 
stop loop. Display total line count. Each line terminated by newline character is counted as one line.*/

import java.io.*;
import java.util.*;
class Q5Student
{
	public static void main(String x[])throws IOException
	{
		Scanner xyz = new Scanner(System.in);
		FileWriter fw = new FileWriter("student.txt");
		System.out.println("File Content");
		for(int i=1;i<=3;i++)
		{
			String data = xyz.nextLine();
			fw.write(data+"\n");
		}
		fw.close();
		
		FileReader fr = new FileReader("student.txt");
		BufferedReader br = new BufferedReader(fr);
		int count =0;
		String line = br.readLine();
		while(line!=null)
		{
			count++;
			line = br.readLine();
		}
		br.close();
		System.out.println("Total lines: "+count);
	}
}