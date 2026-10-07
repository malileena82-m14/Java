/*6. Write a Java program to demonstrate Method Overriding where a child class provides its own implementation 
of a method defined in the parent class. */

class Animal
{
	void display()
	{
		System.out.println("Animal");
	}
}
class Dog extends Animal
{
	void display()
	{
		System.out.println("Dog");
	}
}
class Q6Animal
{
	public static void main(String x[])
	{
		Dog d = new Dog();
		d.display();
	}
}