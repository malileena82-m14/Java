package CollectionProgram;
import java.util.*;
public class VectorParameter {
	public static void main(String x[])
	{
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Vector v = new Vector(al);
		System.out.println("Size is "+ v.size());
		System.out.println(v);
	}
}
