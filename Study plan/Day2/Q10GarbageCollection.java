/*10. Write a Java program that simulates garbage collection eligibility by nullifying object references and requesting 
garbage collection via System.gc().*/

import java.util.*;
class Q10GarbageCollection
{
	public static void main(String x[])
	{
		Q10GarbageCollection g = new Q10GarbageCollection();
		
		g = null;
		
		System.gc();
		System.out.println("Garbage Collection Requested");
	}
}