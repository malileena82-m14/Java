package CollectionProgram;

import java.util.ArrayList;

public class toArray {
	public static void main(String x[])
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		Object obj[] = al.toArray();
		for(Object ob :al)
		{
			System.out.println(ob);
		}
	}
}
