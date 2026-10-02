'''Question 2: Write a Java program to check whether a triangle is valid or not.
Asked In Just Practice assignment
Input:
A = 5, B = 6, C = 7

Output:
Valid Triangle

Explanation:
A triangle is valid if the sum of any two sides is greater than the third side.'''

a = int(input("Enter number1 : "))
b = int(input("Enter number2 : "))
c = int(input("Enter number3 : "))

if a+b>c and a+c>b and b+c>a:
	print("Valid Triangle")
else:
    print("Not Valid Triangle")
