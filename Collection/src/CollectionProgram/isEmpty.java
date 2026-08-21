package CollectionProgram;

import java.util.ArrayList;

public class isEmpty {
	public static void main(String x[])
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		boolean result = al.isEmpty();
		if(result)
		{
			System.out.println("Collection is Empty");
		}
		else
		{
			System.out.println("Collection is not empty");
		}
	}
}
