/*2. Write a Java program to demonstrate Inheritance using the extends keyword. Create a Parent class with a 
method display() and a Child class that inherits and calls the method.*/

import java.util.*;
class Animal
{
	void display()
	{
		System.out.println("Animal is Dog");
	}
}
class Dog extends Animal
{
	/*void show()
	{
		System.out.println("Dog is barks");
	}*/
}
class Q2Inheritance
{
	public static void main(String x[])
	{
		Dog d = new Dog();
		d.display();
		/*d.show();*/
	}
}