package CollectionProgram;

import java.util.*;
public class VectorInitialCapacity {
	public static void main(String x[])
	{
		Vector v = new Vector(2);
		System.out.println("Intial Capacity "+ v.capacity());
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
			
		System.out.println("Size of Vector "+ v.size());
		System.out.println("After Incremental capacity "+v.capacity());
	}
}
