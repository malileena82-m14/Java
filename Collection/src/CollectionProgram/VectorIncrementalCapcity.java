package CollectionProgram;
import java.util.*;
public class VectorIncrementalCapcity {
	public static void main(String x[])
	{
		Vector v = new Vector(4,2);
		System.out.println("Initial Capacity "+v.capacity());
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(10);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(10);
		v.add(10);
		
		System.out.println("Size of Vector "+v.size());
		System.out.println("After Incremental Capacity "+v.capacity());
	}
}
