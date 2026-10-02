'''Question 15: Write a Java program to swap two numbers without using a third variable.
Asked In Basic program
Input:
A = 4
B = 7

Output:
A = 7
B = 4

Explanation:
Swapping is done using arithmetic operations such as addition and subtraction without using an extra variable.'''

a = int(input("Enter num1 : "))
b = int(input("Enter num2 : "))

a = a+b
b = a-b
a = a-b 

print("Output")
print("A : ",a)
print("B : ",b)