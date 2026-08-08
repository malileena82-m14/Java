/*Question 79: Create abstract class FileProcessor.
Asked In Practice Question
Abstract method processFile().
Subclasses:

TextFile

ImageFile

Input
File Type: Text
Output
Processing Text File*/

import java.util.*;
abstract class FileProcessor
{
	String type;
	FileProcessor(String type)
	{
		this.type = type;
	}
	abstract void processFile();
}
class TextFile extends FileProcessor
{
	TextFile(String type)
	{
		super(type);
	}
	void processFile()
	{
		System.out.println("Processing Text File");
	}
}
class ImageFile extends FileProcessor
{
	
	ImageFile(String type)
	{
		super(type);
	}
	void processFile()
	{
		System.out.println("Processing Image File");
	}
}
class Q79FileProcessor
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.TextFile");
		System.out.println("2.ImageFile");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		FileProcessor f;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter type");
				String type = xyz.next();
				f = new TextFile(type);
				f.processFile();
				break;
				
			case 2:
				System.out.println("Enter type");
				String type1 = xyz.next();
				f = new ImageFile(type1);
				f.processFile();
				break;
				
			default:
				System.out.println("Invalid choice");
		}
	}
}