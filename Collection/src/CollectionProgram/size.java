package CollectionProgram;

import java.util.ArrayList;

public class size {
	public static void main(String x[])
	{
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		int len = al.size();
		
		System.out.println("length: "+len);
	}
}
