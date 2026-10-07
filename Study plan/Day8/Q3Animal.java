/*3. Write a Java program to demonstrate Method Overriding and Runtime Polymorphism using a parent 
class Animal and child classes Dog and Cat. */

import java.util.*;
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
class Cat extends Animal
{
	void display()
	{
		System.out.println("Cat");
	}
}
class Q3Animal
{
	public static void main(String x[])
	{
		Animal a ;
		
		a = new Dog();
		a.display();
		
		a = new Cat();
		a.display();
	}
}