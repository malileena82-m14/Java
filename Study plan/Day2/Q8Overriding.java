/*8. Write a Java program to demonstrate method overriding using `Animal` and `Dog` classes.*/

import java.util.*;
class Animal
{
	void sound()
	{
		System.out.println("Animal is Bark");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog is bark");
	}
}
class Q8Overriding
{
	public static void main(String x[])
	{
		Animal a = new Animal();
		Dog d = new Dog();
		a.sound();
		d.sound();
	}
}