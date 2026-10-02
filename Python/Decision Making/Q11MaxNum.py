'''Question 11: Write a java program to find a maximum between three numbers.
Asked In Just Practice assignment
Input:
Number1 = 25
Number2 = 40
Number3 = 32

Output
Maximum number = 40

Explanation:
The program compares all three numbers using conditional statements.
If Number1 is greater than Number2 and Number3, then it is maximum.
Otherwise, compare Number2 and Number3 to find the largest value.'''

num1 = int(input("Enter Number1 : "))
num2 = int(input("Enter Number2 : "))
num3 = int(input("Enter Number3 : "))

if num1>num2 and num1>num3:
    print("Maximum Number : ",num1)
 
elif num2>num1 and num2>num3:
    print("Maximum Number : ",num2)
    
else:
    print("Maximum Number : ",num3)