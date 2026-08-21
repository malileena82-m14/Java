package CollectionProgram;

import java.util.ArrayList;

public class contains {
	public static void main(String x[])
	{
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		boolean result = al.contains(20);
		
		if(result)
		{
			System.out.println("data Found");
		}
		else
		{
			System.out.println("Data not found");
		}
	}
}
