import java.util.*;
class PracticeOccurence
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = xyz.next();
		System.out.println("Enter the Target");
		char ch = xyz.next().charAt(0);
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char t = str.charAt(i);
			if(ch==t)
			{
				count++;
			}
		}
		System.out.println("Occurrence = "+count);
	}
}