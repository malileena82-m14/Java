/*Q10. Write a Java program to check whether a Vector is empty or not.
Description
Create a Vector.
Check using isEmpty() method.
Print appropriate message.
Input
Enter number of elements:
0
Output
Vector is empty*/

package Assignment;

import java.util.*;

public class Assignment10 {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector v = new Vector();

		System.out.println("Enter number of elements");
		int no = xyz.nextInt();

		if (no > 0) {
			System.out.println("Enter elements: ");
			for (int i = 0; i < no; i++) {
				int value = xyz.nextInt();
				v.add(value);
			}
		}

		if (v.isEmpty()) {
			System.out.println("Vector is empty");
		} else {
			System.out.println("Vector is not empty");
		}

	}

}
