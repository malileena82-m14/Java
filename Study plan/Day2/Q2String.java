/*2. Write a Java program that demonstrates string immutability and the difference between string constant pool 
references and heap allocations (== vs .equals()).*/

class Q2String
{
	public static void main(String x[])
	{
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		System.out.println("Str1==str2 : "+(str1==str2));
		System.out.println("Str1.equals(str2) : "+(str1.equals(str2)));
		System.out.println("Str2==str3 : "+(str2==str3));
		System.out.println("Str2.equals(str3) : "+(str2.equals(str3)));
	
	}
}