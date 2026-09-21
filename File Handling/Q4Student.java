/*Question 4:Write a Java program to count total words in a file.
Asked In Practice Assignment
Input:
File content:
Java is easy language

Output:
Total words = 4

Explanation:
Read entire file content as string using BufferedReader and StringBuilder. Split string using space delimiter 
with split method. Count number of elements in resulting string array which represents total words. Handle multiple 
consecutive spaces correctly using regex pattern. Alternatively use StringTokenizer to count words. Display total word count.*/

import java.util.*;
import java.io.*;
class Q4Student
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
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		int count = st.countTokens();
		br.close();
		System.out.println("Total Words ="+count);
		xyz.close();
	}
}