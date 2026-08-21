package CollectionProgram;
import java.util.*;
public class VectorCapacity {
	public static void main(String x[])
	{
		Vector v = new Vector();
		System.out.println("Initial capacity of vector"+v.capacity());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println("size of Vector is "+v.size());
		System.out.println("After capacity increment "+v.capacity());
	}
}
