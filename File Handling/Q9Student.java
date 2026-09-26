/*Question 9: Write a Java program to delete a file.
Asked In Practice Assignment
Input:
Input filename:
student.txt

Output:
File deleted successfully
OR
File not found or deletion failed

Explanation:
Create File object with filename to delete. Check if file exists using exists() method. 
If exists, call delete() method which returns boolean. Returns true if deletion successful, 
false if deletion fails. After successful deletion, file no longer exists and cannot be recovered. 
Display appropriate success or failure message to user. Verify deletion with exists() method.*/

import java.util.*;
import java.io.*;
class Q9Student
{
	public static void main(String x[])throws IOException
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Input File Name");
		String name = xyz.nextLine();
		File f = new File(name);
		
		if(f.exists() && f.isFile())
		{
			if(f.delete())
			{
				System.out.println("Deletion Successful");
			}
			else
		    {
			    System.out.println("Deletion Fails");
		    }
		}
		else
		{
			System.out.println("Deletion Fails");
		}
	}
}